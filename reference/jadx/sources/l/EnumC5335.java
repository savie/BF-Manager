package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۚ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5335 {
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
    public final String f18750;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Byte f18751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f18752;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f18753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18754;

    EnumC5335(byte b, String str, String str2, int i) {
        this.f18751 = Byte.valueOf(b);
        this.f18750 = str;
        this.f18753 = "";
        this.f18752 = str2;
        this.f18754 = i;
    }

    EnumC5335(byte b, String str, String str2, String str3, int i) {
        this.f18751 = Byte.valueOf(b);
        this.f18750 = str;
        this.f18753 = str2;
        this.f18752 = str3;
        this.f18754 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m15990() {
        String[] strArrSplit = name().split("_");
        return strArrSplit[0] + "_" + strArrSplit[1].substring(0, 1).toUpperCase() + strArrSplit[1].substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m15991(EnumC5335... enumC5335Arr) {
        for (EnumC5335 enumC5335 : enumC5335Arr) {
            if (this.f18751.equals(enumC5335.f18751)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte m15988() {
        return this.f18751.byteValue();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m15992() {
        return this.f18750;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m15989(boolean z) {
        return (z ? m15993() : this.f18750).length();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String m15993() {
        return this.f18753.isEmpty() ? this.f18750 : this.f18753;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m15994() {
        return this.f18754;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C8947.m23910(new StringBuilder("<"), this.f18750, "> ");
    }
}
