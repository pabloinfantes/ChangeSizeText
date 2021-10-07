# ChangeSizeText

Este proyecto consiste en añadir un texto y le puedes indicar el tamaño en el quieras que se muestre el texto, para que al darle al botón se muestre otra activity con dicho texto aumentado.

Para hacer que este proyecto funcione de esta manera hemos usado:
- Un binding para unir el xml con la clase usada que en este caso ha sido ChangeSizeTextActivity.
- Una vez unida dichas clases hemos creado un bundle al que le hemos añadidos los datos los cuales pasa el usuario.
- Los datos de dicha clase los proporciona la clase Message a la que le hemos pasado por parametros una clase Application la cual hemos tenido que sobreescribir para crear una nuestra propia
- Luego añadimos dicho Bundle con el mensaje al Intent y con la posterior actualización de los campos, asi obtendriamos los datos en la otra activity.

Todo dicha informacion esta explicada en este enlace:
https://moronlu18.com/wordpress/courses/deint/1559/

Esta es la primera activity

![Captura de pantalla de 2021-10-07 12-11-39](https://user-images.githubusercontent.com/91089366/136365760-220829e6-4f10-48ad-9904-94a73096fdbe.png)

Esta es la segunda activity

![Captura de pantalla de 2021-10-07 12-12-11](https://user-images.githubusercontent.com/91089366/136365847-d3a612b3-8738-4370-b160-5abbfe835040.png)
