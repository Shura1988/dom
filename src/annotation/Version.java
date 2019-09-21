package annotation;/*Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
(поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
а кодовое название версии = Nougat).
Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo),
который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
 String vertion();
 String name();
}
