package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۜᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7323 extends AbstractC4823 implements Comparable, InterfaceC2585 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24478 f24119;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14034 f24120;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f24121;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC8814 f24122;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C24478 f24123;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f24124;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f24125;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f24126;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C24478 f24127;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0064 f24128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10788 f24129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8069 f24130;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final C9559 f24118 = new C9559();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3440[] f24117 = EnumC3440.values();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7323 c7323 = (C7323) obj;
        if (c7323.f24119 == this.f24119) {
            return this.f24128.m1070() - c7323.f24128.m1070();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    static {
        if (EnumC8814.f28795.length != EnumC17963.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m20100() {
        return this.f24121;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f24128;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f24128.getName();
    }

    @Override // l.InterfaceC2585
    public final int getNumber() {
        return this.f24128.m1070();
    }

    public final String toString() {
        return this.f24126;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f24126;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC2848 m20086() {
        return getType().m23655();
    }

    @Override // l.InterfaceC2585
    /* JADX INFO: renamed from: ᩸ۤ */
    public final EnumC20594 mo8651() {
        return mo8652().m11207();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m20085() {
        if (this.f24120.m34195().isEmpty()) {
            return getType() == EnumC8814.f28806 && this.f24130.m14854().m39079() == EnumC4539.CLOSED;
        }
        if (getType() == EnumC8814.f28806) {
            return ((C14495) m14854().m28525((AbstractC17501) C21209.f67697)).m35010() || this.f24130.m14854().m39079() == EnumC4539.CLOSED;
        }
        return false;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f24120;
    }

    public final EnumC8814 getType() {
        C24478 c24478;
        C24478 c24479;
        if (this.f24122 == EnumC8814.f28803 && (((c24478 = this.f24123) == null || !c24478.mo5000().m37139().m17892()) && (((c24479 = this.f24119) == null || !c24479.mo5000().m37139().m17892()) && this.f16868 != null && m14854().m39073() == EnumC12742.DELIMITED))) {
            return EnumC8814.f28793;
        }
        return this.f24122;
    }

    @Override // l.InterfaceC2585
    /* JADX INFO: renamed from: ᩸᩷ */
    public final EnumC3440 mo8652() {
        return f24117[getType().ordinal()];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m20089() {
        if (getType() != EnumC8814.f28807) {
            return false;
        }
        if (this.f24119.mo5000().m37139().m17892() || ((C14495) m14854().m28525((AbstractC17501) C21209.f67697)).m35009().equals(EnumC4055.VERIFY)) {
            return true;
        }
        return m14854().m39068().equals(EnumC24677.VERIFY);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m20096() {
        return getType() == EnumC8814.f28803 && mo8649() && m20093().mo5000().m37139().m17892();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m20090() {
        return m14854().m39074() == EnumC10504.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m20091() {
        return this.f24128.m1077() == EnumC14233.LABEL_OPTIONAL && m14854().m39074() != EnumC10504.LEGACY_REQUIRED;
    }

    @Override // l.InterfaceC2585
    /* JADX INFO: renamed from: ۬ۙ */
    public final boolean mo8649() {
        return this.f24128.m1077() == EnumC14233.LABEL_REPEATED;
    }

    @Override // l.InterfaceC2585
    /* JADX INFO: renamed from: ᩴۤ */
    public final boolean mo8650() {
        if (m20084()) {
            return m14854().m39077().equals(EnumC1556.PACKED);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20084() {
        return mo8649() && mo8652().mo11208();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Object m20097() {
        if (m20086() == EnumC2848.MESSAGE) {
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }
        return this.f24124;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m20083() {
        return this.f24128.m1067();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C24478 m20087() {
        if (this.f24128.m1067()) {
            return this.f24127;
        }
        throw new UnsupportedOperationException(C14442.m34865("This field is not an extension. (", this.f24126, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C24478 m20099() {
        return this.f24119;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10788 m20094() {
        return this.f24129;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10788 m20098() {
        C10788 c10788 = this.f24129;
        if (c10788 == null || c10788.m27499()) {
            return null;
        }
        return c10788;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m20095() {
        if (mo8649()) {
            return false;
        }
        return this.f24125 || getType() == EnumC8814.f28803 || getType() == EnumC8814.f28793 || this.f24128.m1067() || this.f24129 != null || m14854().m39074() != EnumC10504.IMPLICIT;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m20088() {
        if (getType() != EnumC8814.f28793) {
            return false;
        }
        String lowerCase = m20093().getName().toLowerCase();
        C0064 c0064 = this.f24128;
        if (!lowerCase.equals(c0064.getName()) || m20093().mo5003() != this.f24120) {
            return false;
        }
        if (c0064.m1067()) {
            return m20093().m54740() == m20087();
        }
        return m20093().m54740() == this.f24119;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24478 m20093() {
        if (m20086() == EnumC2848.MESSAGE) {
            return this.f24123;
        }
        throw new UnsupportedOperationException(C14442.m34865("This field is not of message type. (", this.f24126, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8069 m20092() {
        if (m20086() == EnumC2848.ENUM) {
            return this.f24130;
        }
        throw new UnsupportedOperationException(C14442.m34865("This field is not of enum type. (", this.f24126, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7323(C0064 c0064, C14034 c14034, C24478 c24478, int i, boolean z) throws C18510 {
        int i2 = 0;
        super(i2);
        this.f16869 = c24478;
        this.f24121 = i;
        this.f24128 = c0064;
        this.f24126 = C19739.m45480(c14034, c24478, c0064.getName());
        this.f24120 = c14034;
        if (c0064.hasType()) {
            this.f24122 = EnumC8814.m23653(c0064.getType());
        }
        this.f24125 = c0064.m1075();
        if (c0064.m1070() > 0) {
            if (z) {
                if (!c0064.m1067()) {
                    throw new C18510(this, "FieldDescriptorProto.extendee not set for extension field.", i2);
                }
                this.f24119 = null;
                if (c24478 != null) {
                    this.f24127 = c24478;
                } else {
                    this.f24127 = null;
                    this.f16869 = c14034;
                }
                if (c0064.m1068()) {
                    throw new C18510(this, "FieldDescriptorProto.oneof_index set for extension field.", i2);
                }
                this.f24129 = null;
            } else {
                if (c0064.m1067()) {
                    throw new C18510(this, "FieldDescriptorProto.extendee set for non-extension field.", i2);
                }
                this.f24119 = c24478;
                if (c0064.m1068()) {
                    if (c0064.m1071() < 0 || c0064.m1071() >= c24478.mo5000().m37133()) {
                        throw new C18510(this, "FieldDescriptorProto.oneof_index is out of range for type ".concat(c24478.getName()), i2);
                    }
                    C10788 c10788 = (C10788) c24478.m54737().get(c0064.m1071());
                    this.f24129 = c10788;
                    C10788.m27496(c10788);
                    this.f16869 = c10788;
                } else {
                    this.f24129 = null;
                }
                this.f24127 = null;
            }
            c14034.f44472.m48903(this);
            return;
        }
        throw new C18510(this, "Field numbers must be positive integers.", i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20079(C7323 c7323) {
        c7323.m14855(c7323.f24128.m1069().m16370());
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ֫ */
    public final C16471 mo14853() {
        C7301 c7301NewBuilder = C16471.newBuilder();
        C14034 c14034 = this.f24120;
        if (c14034.m34197().getNumber() >= EnumC5810.EDITION_2023.getNumber()) {
            return c7301NewBuilder.build();
        }
        C0064 c0064 = this.f24128;
        if (c0064.m1077() == EnumC14233.LABEL_REQUIRED) {
            c7301NewBuilder.m19972(EnumC10504.LEGACY_REQUIRED);
        }
        if (c0064.getType() == EnumC17963.TYPE_GROUP) {
            c7301NewBuilder.m19973(EnumC12742.DELIMITED);
        }
        if (c14034.m34197() == EnumC5810.EDITION_PROTO2 && c0064.m1069().m16361()) {
            c7301NewBuilder.m19970(EnumC1556.PACKED);
        }
        if (c14034.m34197() == EnumC5810.EDITION_PROTO3 && c0064.m1069().m16352() && !c0064.m1069().m16361()) {
            c7301NewBuilder.m19970(EnumC1556.EXPANDED);
        }
        return c7301NewBuilder.build();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo14856() {
        C14034 c14034 = this.f24120;
        if (c14034.m34197().getNumber() >= EnumC5810.EDITION_2023.getNumber()) {
            return false;
        }
        C0064 c0064 = this.f24128;
        if (c0064.m1077() == EnumC14233.LABEL_REQUIRED || c0064.getType() == EnumC17963.TYPE_GROUP || c0064.m1069().m16361()) {
            return true;
        }
        return c14034.m34197() == EnumC5810.EDITION_PROTO3 && c0064.m1069().m16352() && !c0064.m1069().m16361();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩻ */
    public final void mo14857() throws C18510 {
        C24478 c24478 = this.f24119;
        if (c24478 != null && c24478.mo5000().m37139().m17896() && this.f24128.m1067()) {
            if (!m20091() || getType() != EnumC8814.f28803) {
                throw new C18510(this, "Extensions of MessageSets must be optional messages.", 0);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20082(C7323 c7323) throws C18510 {
        C14034 c14034 = c7323.f24120;
        C0064 c0064 = c7323.f24128;
        int i = 0;
        if (c0064.m1067()) {
            AbstractC4823 abstractC4823M48901 = c14034.f44472.m48901(c0064.m1061(), c7323, EnumC14780.TYPES_ONLY);
            if (!(abstractC4823M48901 instanceof C24478)) {
                throw new C18510(c7323, "\"" + c0064.m1061() + "\" is not a message type.", i);
            }
            C24478 c24478 = (C24478) abstractC4823M48901;
            c7323.f24119 = c24478;
            if (!c24478.m54742(c0064.m1070())) {
                throw new C18510(c7323, "\"" + c7323.f24119.mo5002() + "\" does not declare " + c0064.m1070() + " as an extension number.", i);
            }
        }
        if (c0064.m1060()) {
            AbstractC4823 abstractC4823M48902 = c14034.f44472.m48901(c0064.m1062(), c7323, EnumC14780.TYPES_ONLY);
            if (!c0064.hasType()) {
                if (abstractC4823M48902 instanceof C24478) {
                    c7323.f24122 = EnumC8814.f28803;
                } else if (abstractC4823M48902 instanceof C8069) {
                    c7323.f24122 = EnumC8814.f28806;
                } else {
                    throw new C18510(c7323, "\"" + c0064.m1062() + "\" is not a type.", i);
                }
            }
            if (c7323.f24122.m23655() == EnumC2848.MESSAGE) {
                if (!(abstractC4823M48902 instanceof C24478)) {
                    throw new C18510(c7323, "\"" + c0064.m1062() + "\" is not a message type.", i);
                }
                c7323.f24123 = (C24478) abstractC4823M48902;
                if (c0064.m1073()) {
                    throw new C18510(c7323, "Messages can't have default values.", i);
                }
            } else if (c7323.f24122.m23655() == EnumC2848.ENUM) {
                if (!(abstractC4823M48902 instanceof C8069)) {
                    throw new C18510(c7323, "\"" + c0064.m1062() + "\" is not an enum type.", i);
                }
                c7323.f24130 = (C8069) abstractC4823M48902;
            } else {
                throw new C18510(c7323, "Field with primitive type has type_name.", i);
            }
        } else if (c7323.f24122.m23655() == EnumC2848.MESSAGE || c7323.f24122.m23655() == EnumC2848.ENUM) {
            throw new C18510(c7323, "Field with message or enum type missing type_name.", i);
        }
        if (c0064.m1069().m16361() && !c7323.m20084()) {
            throw new C18510(c7323, "[packed = true] can only be specified for repeated primitive fields.", i);
        }
        if (c0064.m1073()) {
            if (c7323.mo8649()) {
                throw new C18510(c7323, "Repeated fields cannot have default values.", i);
            }
            try {
                switch (C6578.f22062[c7323.f24122.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c7323.f24124 = Integer.valueOf(C17414.m40887(c0064.m1064()));
                        return;
                    case 4:
                    case 5:
                        c7323.f24124 = Integer.valueOf(C17414.m40890(c0064.m1064()));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        c7323.f24124 = Long.valueOf(C17414.m40892(c0064.m1064()));
                        return;
                    case 9:
                    case 10:
                        c7323.f24124 = Long.valueOf(C17414.m40894(c0064.m1064()));
                        return;
                    case 11:
                        if (c0064.m1064().equals("inf")) {
                            c7323.f24124 = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (c0064.m1064().equals("-inf")) {
                            c7323.f24124 = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (c0064.m1064().equals("nan")) {
                            c7323.f24124 = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            c7323.f24124 = Float.valueOf(c0064.m1064());
                            return;
                        }
                    case 12:
                        if (c0064.m1064().equals("inf")) {
                            c7323.f24124 = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (c0064.m1064().equals("-inf")) {
                            c7323.f24124 = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (c0064.m1064().equals("nan")) {
                            c7323.f24124 = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            c7323.f24124 = Double.valueOf(c0064.m1064());
                            return;
                        }
                    case 13:
                        c7323.f24124 = Boolean.valueOf(c0064.m1064());
                        return;
                    case 14:
                        c7323.f24124 = c0064.m1064();
                        return;
                    case 15:
                        try {
                            c7323.f24124 = C17414.m40891(c0064.m1064());
                            return;
                        } catch (C5482 e) {
                            throw new C18510(c7323, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 16:
                        C1357 c1357M21964 = c7323.f24130.m21964(c0064.m1064());
                        c7323.f24124 = c1357M21964;
                        if (c1357M21964 != null) {
                            return;
                        }
                        throw new C18510(c7323, "Unknown enum default value: \"" + c0064.m1064() + '\"', i);
                    case 17:
                    case 18:
                        throw new C18510(c7323, "Message type had default value.", i);
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new C18510(c7323, "Could not parse default value: \"" + c0064.m1064() + '\"', e2);
            }
            throw new C18510(c7323, "Could not parse default value: \"" + c0064.m1064() + '\"', e2);
        }
        if (c7323.mo8649()) {
            c7323.f24124 = Collections.EMPTY_LIST;
            return;
        }
        int i2 = C6578.f22061[c7323.f24122.m23655().ordinal()];
        if (i2 == 1) {
            c7323.f24124 = c7323.f24130.m21965().get(0);
        } else if (i2 != 2) {
            c7323.f24124 = c7323.f24122.m23655().f9369;
        } else {
            c7323.f24124 = null;
        }
    }

    @Override // l.InterfaceC2585
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7588 mo8648(InterfaceC7588 interfaceC7588, InterfaceC18775 interfaceC18775) {
        return ((InterfaceC14299) interfaceC7588).mergeFrom((InterfaceC21013) interfaceC18775);
    }
}
