package l;

/* JADX INFO: renamed from: l.ۤۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DY */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10020 {
    NOT_SUPPORTED("NotSupported", null, null, null),
    SOURCE_FILE("SourceFile", EnumC16783.f53741, EnumC20934.f68038, C22784.class),
    ENCLOSING_METHOD("EnclosingMethod", EnumC16783.f53718, EnumC20934.f68027, C2507.class),
    NEST_MEMBERS("NestMembers", EnumC16783.f53752, EnumC20934.f68169, C23407.class),
    NEST_HOST("NestHost", EnumC16783.f53726, EnumC20934.f68023, C10707.class),
    INNER_CLASSES("InnerClasses", EnumC16783.f53720, EnumC20934.f68134, C22970.class),
    SIGNATURE("Signature", EnumC16783.f53727, EnumC20934.f68121, C12906.class),
    CONSTANT_POOL("Constant pool", null, null, C11038.class),
    METHOD_DATA("Method_info", null, null, C5061.class),
    FIELD_DATA("Field_info", null, null, C13092.class),
    RECORD_DATA("record_component_info", null, null, C0910.class),
    LINE_NUMBERS("LineNumberTable", EnumC16783.f53722, EnumC20934.f68144, C10270.class),
    LOCAL_VARIABLES("LocalVariableTable", EnumC16783.f53734, EnumC20934.f68217, C15915.class),
    LOCAL_VARIABLE_TYPES("LocalVariableTypeTable", EnumC16783.f53719, EnumC20934.f68029, C20148.class),
    EXCEPTIONS("throws", null, EnumC20934.f68198, C5330.class),
    STACK_MAP("StackMap", EnumC16783.f53748, EnumC20934.f68051, C17139.class),
    STACK_MAP_TABLE("StackMapTable", EnumC16783.f53716, EnumC20934.f68067, C17139.class),
    BOOTSTRAP_METHOD("BootstrapMethods", EnumC16783.f53724, EnumC20934.f68170, C9358.class);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Class f34221;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f34222;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC16783 f34223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f34224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC20934 f34225;

    EnumC10020(String str, EnumC16783 enumC16783, EnumC20934 enumC20934, Class cls) {
        this.f34224 = str;
        this.f34223 = enumC16783;
        this.f34225 = enumC20934;
        this.f34222 = str;
        this.f34221 = cls;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String m25297() {
        return this.f34224;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String m25298() {
        return this.f34222;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m25300() {
        return this.f34221 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16783 m25299() {
        return this.f34223;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC20934 m25301() {
        return this.f34225;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10020 m25295(Class cls) {
        for (EnumC10020 enumC10020 : values()) {
            if (cls.equals(enumC10020.f34221)) {
                return enumC10020;
            }
        }
        return NOT_SUPPORTED;
    }
}
