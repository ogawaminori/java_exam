SELECT 
 regions.name AS region,
 prefectures.name AS prefectures
FROM prefectures 
INNER JOIN regions 
ON regions.code=prefectures.region_code;
