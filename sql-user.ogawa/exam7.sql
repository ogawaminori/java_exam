
SELECT

prefectures.name AS prefecture,
genders.name AS gender,
populations.population As population

FROM prefectures AS pre


INNER JOIN populations AS pop
ON pop.prefecture_code=pre.code

INNER JOIN genders AS g
ON g.code=pop.gender_code

WHERE pre.region_code = '80';
