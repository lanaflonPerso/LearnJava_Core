package awt_abstract_window_toolkit;

public class ExampleComponent {
    public static void main(String[] args) {

    }
}


/*
-----------------------------------------------------------------------------------------------------------------------
•boolean isVisibleO
•void setVisible (boolean b )
    Получают или устанавливают свойство видимости visible. Компоненты являются видимыми изначально, кроме компонентов
    верхнего уровня типа JFraxne.

•voidsetSize(int width, int height) 1.1
    Устанавливает текущую ширину и высоту компонента.

•void setLocation(int х , int у) 1.1
    Перемещает компонент в новую точку. Если компонент не относится к верхнему уровню, то его координаты х и у отсчитываются
    относительно контейнера, а иначе используется экранная система координат (например, для объектов типа JFramel.

•void setBounds(int x, inty, int width, int height) 1.1
    Перемещает текущий компонент и изменяет его размеры. Расположение левого верхнего угла задаютпараметрых иу,
    ановыйразмер—параметрыw idth иheight.

•Dimension getSizeO 1.1
•void setSize(Dimension d) 1.1
    Получают или устанавливают свойство size, задающее размеры текущего компонента.

•void repaint()
    Вызывает перерисовку компонента. Перерисовка выполняется сразу же после того, как возникнут условия, позволяющие это сделать.

•Dimension getPreferredSize()
    Этот метод переопределяется для возврата предпочтительных размеров данного компонента.

•Color getBackgroundO
•void setBackground(Color c)
    Получают или устанавливают цвет фона.
        Параметры:
                с: Новый цвет фона

•Color getForegroundO
•void setForeground(Color c)
    Получают или устанавливают цвет переднего плана.
        Параметры:
                с: Новый цвет переднего плана
                
•public void setCursor (Cursor cursor) 1.1
	Изменяет внешний вид курсора.
-----------------------------------------------------------------------------------------------------------------------
*/
