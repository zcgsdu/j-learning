package com.zcg.learning.java8inaction.chap5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Test {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
		
		List<Transaction> q1 = transactions.stream().filter(t -> t.getYear()==2011).sorted(comparing(Transaction::getValue))
				.collect(toList());
		
		List<String> q2 = transactions.stream().map(t->t.getTrader().getCity())
				.distinct()
				.collect(toList());
		
		List<Trader> q3 = transactions.stream().map(Transaction::getTrader)
				.filter(t->"Cambridge".equals(t.getCity()))
				.sorted(comparing(Trader::getName))
				.collect(toList());
		
		String q4 = transactions.stream().map(t->t.getTrader().getName())
				.distinct()
				.sorted()
				.collect(joining());
		
		boolean q5  = transactions.stream()
				.anyMatch(t->"MiLan".equals(t.getTrader().getCity()));
		
		int q6 = transactions.stream()
				.filter(t->"Cambridge".equals(t.getTrader().getCity()))
				.collect(summingInt(Transaction::getValue));
		
		OptionalInt q7 = transactions.stream().mapToInt(Transaction::getValue).max();
		q7.orElse(1);
		
		Optional<Transaction> q8 = transactions.stream().min(comparing(Transaction::getValue));
	}

}
