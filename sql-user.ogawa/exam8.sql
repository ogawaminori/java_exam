

SELECT 
prefectures.name
CASE 
WHEN gernerations.code=1 gender='男'
THEN populations.population
ELSE 0 END

WHEN gernerations.code=2 gender='男'
THEN populations.population
ELSE 0 END

WHEN gernerations.code=3 gender='男'
THEN populations.population
ELSE 0 END

WHEN gernerations.code=1 gender='女'
THEN populations.population
ELSE 0 END

WHEN gernerations.code=2 gender='女'
THEN populations.population
ELSE 0 END

WHEN gernerations.code=3 gender='女'
THEN populations.population
ELSE 0 END

FROM populations AS pop

INNER JOIN prefectures AS pre
ON pop.prefecture_code=pre.code

INNER JOIN genders AS g
ON pop.gender_code=g.code;

INNER JOIN generations AS gene
ON gene.code=pop.generation_code
