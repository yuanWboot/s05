package com.zy.spring.ioc.dao;

public class Order {
  private Float  price;
  private Integer  quantity;
  private Float  total;

    public Order() {
        System.out.println("对象行为1（对象实例化实行构造方法）：创建Order对象："+this);
    }

    public Order(Float price, Integer quantity, Float total) {
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    private void init() {
        System.out.println("对象行为2：执行init()方法");
        total = price * quantity;
    }

  public void pay() {
      System.out.println("对象行为3（执行业务代码）：订单的金额为："+total);
  }
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        System.out.println("设置price:"+price);
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        System.out.println("设置quantity:"+quantity);
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }


    private void destroy() {
        System.out.println("对象行为4（调用destroy-method方法释放资源）：释放与订单对象相关的资源");
    }
}
