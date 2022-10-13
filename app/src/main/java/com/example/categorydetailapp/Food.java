package com.example.categorydetailapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name;
    private double price;
    private String desc;
    private int imageResourceID;

   /*
   To auto generate code, go on the top menu to Code - Generate and select
   what you want   Make sure your cursor is positioned where you want the code
   to be inserted.
    */

    public Food(String name, double price, String desc, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.imageResourceID = imageResourceID;
    }

    public Food(String name, double price, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.imageResourceID = imageResourceID;
        this.desc = "";
    }
    // A default constructor is required for the Parcelable interface to work
    public Food() {
        name = "";
        price = 0;
        desc = "";
        imageResourceID = 0;
    }

    public Food(Parcel parcel) {
        name = parcel.readString();
        price = parcel.readDouble();
        desc = parcel.readString();
        imageResourceID = parcel.readInt();
    }

    //This code will most likely stay the same for all classes you use Parcelable with
    //the only thing you need to change is the class name
    public static final Parcelable.Creator<Food> CREATOR = new
            Parcelable.Creator<Food>() {

                @Override
                public Food createFromParcel(Parcel parcel) {
                    return new Food(parcel);
                }

                @Override
                public Food[] newArray(int size) {
                    return new Food[0];
                }
            };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(price);
        dest.writeString(desc);
        dest.writeInt(imageResourceID);
    }


    public static final Food[] myBreakfast = {
            new Food("Breakfast Burrito", 3.19, "Egg, Meat and Cheese in a Burrito", R.drawable.breakfastburrito),
            new Food("Hashbrown", 1.29, "Crispy Golden Brown", R.drawable.hashbrow),
            new Food("Coffee", 1.99, "Powerful Start to your Day", R.drawable.coffee)

    };
    public static final Food[] myLunch = {
            new Food("Chicken Quesadilla", 4.39, "Grilled chicken in a flour tortilla", R.drawable.chicken_quesadilla),
            new Food("Crunchwrap Supreme", 4.49, "One handed Meal Staple", R.drawable.crunchwrap_supreme),
            new Food("Chalupa Supreme", 3.89, "Perfect blend of crunch and chewy", R.drawable.chalupa_supreme)


    };

    public static final Food[] myDinner = {
            new Food("Mexican Pizza", 4.49, "2 Tostadas with plenty seasoning", R.drawable.mexican_pizza),
            new Food("Nacho BellGrande", 4.69, "King of Nachos", R.drawable.nacho_bellgrande),
            new Food("Grilled Cheese Burrito", 4.29, "Classic burrito with 3 cheese on top", R.drawable.grilled_cheeseburrito)

    };




    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    /**
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     */

    @Override
    public int describeContents() {
        return 0;
    }

}

