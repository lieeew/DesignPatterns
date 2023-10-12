package com.leikooo.principle.inversion.improve;

public class DependencyPass {

    public static void main(String[] args) {


    }

}

// 直接传递
interface IOpenAndClose {
    public void open(ITV tv);
}

interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}

// 使用构造器
// interface IOpenAndClose {
//     public void open();
// }
//
// interface ITV {
//     public void play();
// }
//
// class OpenAndClose implements IOpenAndClose {
//     public ITV tv;
//
//     public OpenAndClose(ITV tv) {
//         this.tv = tv;
//     }
//
//     public void open() {
//         this.tv.play();
//     }
// }
//
//
// interface IOpenAndClose {
//     public void open();
//
//     public void setTv(ITV tv);
// }
//
// interface ITV {
//     public void play();
// }
// 使用 setter 方法
// class OpenAndClose implements IOpenAndClose {
//     private ITV tv;
//
//     public void setTv(ITV tv) {
//         this.tv = tv;
//     }
//
//     public void open() {
//         this.tv.play();
//     }
// }
