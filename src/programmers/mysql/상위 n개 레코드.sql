SELECT name
FROM ANIMAL_INS
WHERE datetime = (SELECT MIN(datetime) FROM ANIMAL_INS);