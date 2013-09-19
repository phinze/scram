# scram

Shuffle columns on a bunch of CSVs.

## Usage

```
lein run <list of csv files>
```

For each CSV file, shuffles the columns, and saves a `.shuffled` version.

Prints out unshuffled and shuffled header information so you can see what it's doing.

## Example

```
$ lein run csvs/*.csv
[ csvs/001.csv ] > [foo bar baz] -> [bar baz foo] > [ csvs/001.csv.shuffled ]
[ csvs/002.csv ] > [qux quux baz] -> [qux baz quux] > [ csvs/002.csv.shuffled ]
[ csvs/003.csv ] > [foo qux baz] -> [qux foo baz] > [ csvs/003.csv.shuffled ]
[ csvs/004.csv ] > [foo bar baz] -> [baz bar foo] > [ csvs/004.csv.shuffled ]
[ csvs/005.csv ] > [qux quux baz] -> [quux qux baz] > [ csvs/005.csv.shuffled ]
```

## License

Copyright © 2013 Paul Hinze

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
