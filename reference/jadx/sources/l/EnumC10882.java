package l;

/* JADX INFO: renamed from: l.ۤ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DY */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10882 {
    NOT_SUPPORTED("NotSupported", null, null, null),
    SOURCE_FILE("SourceFile", EnumC13127.f41962, EnumC5202.f18215, C24660.class),
    ENCLOSING_METHOD("EnclosingMethod", EnumC13127.f41952, EnumC5202.f18297, C3097.class),
    NEST_MEMBERS("NestMembers", EnumC13127.f41977, EnumC5202.f18146, C15708.class),
    NEST_HOST("NestHost", EnumC13127.f41958, EnumC5202.f18298, C20184.class),
    INNER_CLASSES("InnerClasses", EnumC13127.f41961, EnumC5202.f18206, C18013.class),
    SIGNATURE("Signature", EnumC13127.f41976, EnumC5202.f18151, C20930.class),
    CONSTANT_POOL("Constant pool", null, null, C1606.class),
    METHOD_DATA("Method_info", null, null, C3381.class),
    FIELD_DATA("Field_info", null, null, C3843.class),
    RECORD_DATA("record_component_info", null, null, C3776.class),
    LINE_NUMBERS("LineNumberTable", EnumC13127.f41946, EnumC5202.f18329, C9063.class),
    LOCAL_VARIABLES("LocalVariableTable", EnumC13127.f41957, EnumC5202.f18274, C6827.class),
    LOCAL_VARIABLE_TYPES("LocalVariableTypeTable", EnumC13127.f41974, EnumC5202.f18255, C13538.class),
    EXCEPTIONS("throws", null, EnumC5202.f18313, C20251.class),
    STACK_MAP("StackMap", EnumC13127.f41972, EnumC5202.f18260, C22180.class),
    STACK_MAP_TABLE("StackMapTable", EnumC13127.f41967, EnumC5202.f18182, C22180.class),
    BOOTSTRAP_METHOD("BootstrapMethods", EnumC13127.f41955, EnumC5202.f18141, C20361.class);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f34451;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f34452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC13127 f34453;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Class f34454;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC5202 f34455;

    EnumC10882(String str, EnumC13127 enumC13127, EnumC5202 enumC5202, Class cls) {
        this.f34451 = str;
        this.f34453 = enumC13127;
        this.f34455 = enumC5202;
        this.f34452 = str;
        this.f34454 = cls;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m27632() {
        return this.f34451;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m27630() {
        return this.f34452;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m27633() {
        return this.f34454 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC13127 m27631() {
        return this.f34453;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC5202 m27634() {
        return this.f34455;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10882 m27628(Class cls) {
        for (EnumC10882 enumC10882 : values()) {
            if (cls.equals(enumC10882.f34454)) {
                return enumC10882;
            }
        }
        return NOT_SUPPORTED;
    }
}
