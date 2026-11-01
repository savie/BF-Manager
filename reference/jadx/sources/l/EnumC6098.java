package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6098 {
    CONSTANT_NULL((byte) 0, "null", "CONSTANT_NULL", 1),
    CONSTANT_UTF8((byte) 1, "Utf8", "CONSTANT_UTF8", 1),
    CONSTANT_INTEGER((byte) 3, ClassTransform.INTEGER, "Integer", "CONSTANT_INTEGER", 1),
    CONSTANT_FLOAT((byte) 4, ClassTransform.FLOAT, "Float", "CONSTANT_FLOAT", 1),
    CONSTANT_LONG((byte) 5, ClassTransform.LONG, "Long", "CONSTANT_LONG", 2),
    CONSTANT_DOUBLE((byte) 6, ClassTransform.DOUBLE, "Double", "CONSTANT_DOUBLE", 2),
    CONSTANT_CLASS((byte) 7, Name.LABEL, "Class", "CONSTANT_CLASS", 1),
    CONSTANT_STRING((byte) 8, "String", "CONSTANT_STRING", 1),
    CONSTANT_FIELD((byte) 9, "Field", "Fieldref", "CONSTANT_FIELD", 1),
    CONSTANT_METHOD((byte) 10, "Method", "Methodref", "CONSTANT_METHOD", 1),
    CONSTANT_INTERFACEMETHOD((byte) 11, "InterfaceMethod", "InterfaceMethodref", "CONSTANT_INTERFACEMETHOD", 1),
    CONSTANT_NAMEANDTYPE((byte) 12, "NameAndType", "CONSTANT_NAMEANDTYPE", 1),
    CONSTANT_METHODHANDLE((byte) 15, "MethodHandle", "CONSTANT_METHODHANDLE", 1),
    CONSTANT_METHODTYPE((byte) 16, "MethodType", "CONSTANT_METHODTYPE", 1),
    CONSTANT_DYNAMIC((byte) 17, "Dynamic", "CONSTANT_DYNAMIC", 1),
    CONSTANT_INVOKEDYNAMIC((byte) 18, "InvokeDynamic", "CONSTANT_INVOKEDYNAMIC", 1),
    CONSTANT_MODULE((byte) 19, "Module", "CONSTANT_MODULE", 1),
    CONSTANT_PACKAGE((byte) 20, "Package", "CONSTANT_PACKAGE", 1);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f20660;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Byte f20661;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f20662;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f20664;

    EnumC6098(byte b, String str, String str2, int i) {
        this.f20661 = Byte.valueOf(b);
        this.f20663 = str;
        this.f20660 = "";
        this.f20662 = str2;
        this.f20664 = i;
    }

    EnumC6098(byte b, String str, String str2, String str3, int i) {
        this.f20661 = Byte.valueOf(b);
        this.f20663 = str;
        this.f20660 = str2;
        this.f20662 = str3;
        this.f20664 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m16593() {
        String[] strArrSplit = name().split("_");
        return strArrSplit[0] + "_" + strArrSplit[1].substring(0, 1).toUpperCase() + strArrSplit[1].substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m16594(EnumC6098... enumC6098Arr) {
        for (EnumC6098 enumC6098 : enumC6098Arr) {
            if (this.f20661.equals(enumC6098.f20661)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte m16591() {
        return this.f20661.byteValue();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String m16590() {
        return this.f20663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m16592(boolean z) {
        return (z ? m16595() : this.f20663).length();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m16595() {
        return this.f20660.isEmpty() ? this.f20663 : this.f20660;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m16596() {
        return this.f20664;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C22697.m50267(new StringBuilder("<"), this.f20663, "> ");
    }
}
