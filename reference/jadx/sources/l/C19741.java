package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩵᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19741 extends AbstractC10569 implements Comparable, InterfaceC18930 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21151 f63432;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f63433;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C4259 f63434;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC8452 f63435;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2806 f63436;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2806 f63437;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9158 f63438;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f63439;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f63440;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2806 f63441;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7040 f63442;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f63443;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final C18329 f63431 = new C18329();

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180[] f63430 = EnumC3180.values();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19741 c19741 = (C19741) obj;
        if (c19741.f63441 == this.f63441) {
            return this.f63434.m12046() - c19741.f63434.m12046();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    static {
        if (EnumC8452.f29318.length != EnumC13433.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m44900() {
        return this.f63440;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f63434;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f63434.getName();
    }

    @Override // l.InterfaceC18930
    public final int getNumber() {
        return this.f63434.m12046();
    }

    public final String toString() {
        return this.f63443;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f63443;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC19035 m44913() {
        return getType().m22111();
    }

    @Override // l.InterfaceC18930
    /* JADX INFO: renamed from: ۨۨ */
    public final EnumC4508 mo23410() {
        return mo23407().m9597();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f63438;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m44905() {
        if (this.f63438.m23485().isEmpty()) {
            return getType() == EnumC8452.f29322 && this.f63442.m26726().m51882() == EnumC10133.CLOSED;
        }
        if (getType() == EnumC8452.f29322) {
            return ((C22169) m26726().m17284((AbstractC14802) C1001.f4676)).m49187() || this.f63442.m26726().m51882() == EnumC10133.CLOSED;
        }
        return false;
    }

    public final EnumC8452 getType() {
        C2806 c2806;
        C2806 c2807;
        if (this.f63435 == EnumC8452.f29310 && (((c2806 = this.f63437) == null || !c2806.mo8524().m1367().m29471()) && (((c2807 = this.f63441) == null || !c2807.mo8524().m1367().m29471()) && this.f36172 != null && m26726().m51877() == EnumC16483.DELIMITED))) {
            return EnumC8452.f29320;
        }
        return this.f63435;
    }

    @Override // l.InterfaceC18930
    /* JADX INFO: renamed from: ۖܰ */
    public final EnumC3180 mo23407() {
        return f63430[getType().ordinal()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44898() {
        if (getType() != EnumC8452.f29312) {
            return false;
        }
        if (this.f63441.mo8524().m1367().m29471() || ((C22169) m26726().m17284((AbstractC14802) C1001.f4676)).m49185().equals(EnumC5235.VERIFY)) {
            return true;
        }
        return m26726().m51872().equals(EnumC10839.VERIFY);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44909() {
        return getType() == EnumC8452.f29310 && mo23408() && m44907().mo8524().m1367().m29471();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m44914() {
        return m26726().m51875() == EnumC20716.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m44899() {
        return this.f63434.m12055() == EnumC22605.LABEL_OPTIONAL && m26726().m51875() != EnumC20716.LEGACY_REQUIRED;
    }

    @Override // l.InterfaceC18930
    /* JADX INFO: renamed from: ۗۙ */
    public final boolean mo23408() {
        return this.f63434.m12055() == EnumC22605.LABEL_REPEATED;
    }

    @Override // l.InterfaceC18930
    /* JADX INFO: renamed from: ۖۨ */
    public final boolean mo23406() {
        if (m44903()) {
            return m26726().m51878().equals(EnumC17188.PACKED);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44903() {
        return mo23408() && mo23407().mo5811();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Object m44911() {
        if (m44913() == EnumC19035.MESSAGE) {
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }
        return this.f63439;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2806 m44902() {
        if (this.f63434.m12043()) {
            return this.f63436;
        }
        throw new UnsupportedOperationException(C16523.m38890("This field is not an extension. (", this.f63443, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44908() {
        return this.f63434.m12043();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2806 m44910() {
        return this.f63441;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21151 m44906() {
        return this.f63432;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21151 m44912() {
        C21151 c21151 = this.f63432;
        if (c21151 == null || c21151.m47592()) {
            return null;
        }
        return c21151;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m44897() {
        if (mo23408()) {
            return false;
        }
        return this.f63433 || getType() == EnumC8452.f29310 || getType() == EnumC8452.f29320 || this.f63434.m12043() || this.f63432 != null || m26726().m51875() != EnumC20716.IMPLICIT;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m44904() {
        if (getType() != EnumC8452.f29320) {
            return false;
        }
        String lowerCase = m44907().getName().toLowerCase();
        C4259 c4259 = this.f63434;
        if (!lowerCase.equals(c4259.getName()) || m44907().mo8528() != this.f63438) {
            return false;
        }
        if (c4259.m12043()) {
            return m44907().m8530() == m44902();
        }
        return m44907().m8530() == this.f63441;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2806 m44907() {
        if (m44913() == EnumC19035.MESSAGE) {
            return this.f63437;
        }
        throw new UnsupportedOperationException(C16523.m38890("This field is not of message type. (", this.f63443, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7040 m44901() {
        if (m44913() == EnumC19035.ENUM) {
            return this.f63442;
        }
        throw new UnsupportedOperationException(C16523.m38890("This field is not of enum type. (", this.f63443, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19741(C4259 c4259, C9158 c9158, C2806 c2806, int i, boolean z) throws C13391 {
        int i2 = 0;
        super(i2);
        this.f36173 = c2806;
        this.f63440 = i;
        this.f63434 = c4259;
        this.f63443 = C20446.m46243(c9158, c2806, c4259.getName());
        this.f63438 = c9158;
        if (c4259.hasType()) {
            this.f63435 = EnumC8452.m22109(c4259.getType());
        }
        this.f63433 = c4259.m12050();
        if (c4259.m12046() > 0) {
            if (z) {
                if (!c4259.m12043()) {
                    throw new C13391(this, "FieldDescriptorProto.extendee not set for extension field.", i2);
                }
                this.f63441 = null;
                if (c2806 != null) {
                    this.f63436 = c2806;
                } else {
                    this.f63436 = null;
                    this.f36173 = c9158;
                }
                if (c4259.m12047()) {
                    throw new C13391(this, "FieldDescriptorProto.oneof_index set for extension field.", i2);
                }
                this.f63432 = null;
            } else {
                if (c4259.m12043()) {
                    throw new C13391(this, "FieldDescriptorProto.extendee set for non-extension field.", i2);
                }
                this.f63441 = c2806;
                if (c4259.m12047()) {
                    if (c4259.m12054() < 0 || c4259.m12054() >= c2806.mo8524().m1366()) {
                        throw new C13391(this, "FieldDescriptorProto.oneof_index is out of range for type ".concat(c2806.getName()), i2);
                    }
                    C21151 c21151 = (C21151) c2806.m8527().get(c4259.m12054());
                    this.f63432 = c21151;
                    C21151.m47590(c21151);
                    this.f36173 = c21151;
                } else {
                    this.f63432 = null;
                }
                this.f63436 = null;
            }
            c9158.f31130.m4887(this);
            return;
        }
        throw new C13391(this, "Field numbers must be positive integers.", i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44893(C19741 c19741) {
        c19741.m26727(c19741.f63434.m12049().m31615());
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۘ */
    public final C23539 mo23481() {
        C19305 c19305NewBuilder = C23539.newBuilder();
        C9158 c9158 = this.f63438;
        if (c9158.m23487().getNumber() >= EnumC12167.EDITION_2023.getNumber()) {
            return c19305NewBuilder.build();
        }
        C4259 c4259 = this.f63434;
        if (c4259.m12055() == EnumC22605.LABEL_REQUIRED) {
            c19305NewBuilder.m44295(EnumC20716.LEGACY_REQUIRED);
        }
        if (c4259.getType() == EnumC13433.TYPE_GROUP) {
            c19305NewBuilder.m44293(EnumC16483.DELIMITED);
        }
        if (c9158.m23487() == EnumC12167.EDITION_PROTO2 && c4259.m12049().m31605()) {
            c19305NewBuilder.m44294(EnumC17188.PACKED);
        }
        if (c9158.m23487() == EnumC12167.EDITION_PROTO3 && c4259.m12049().m31607() && !c4259.m12049().m31605()) {
            c19305NewBuilder.m44294(EnumC17188.EXPANDED);
        }
        return c19305NewBuilder.build();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo23480() {
        C9158 c9158 = this.f63438;
        if (c9158.m23487().getNumber() >= EnumC12167.EDITION_2023.getNumber()) {
            return false;
        }
        C4259 c4259 = this.f63434;
        if (c4259.m12055() == EnumC22605.LABEL_REQUIRED || c4259.getType() == EnumC13433.TYPE_GROUP || c4259.m12049().m31605()) {
            return true;
        }
        return c9158.m23487() == EnumC12167.EDITION_PROTO3 && c4259.m12049().m31607() && !c4259.m12049().m31605();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ᩺ */
    public final void mo26728() throws C13391 {
        C2806 c2806 = this.f63441;
        if (c2806 != null && c2806.mo8524().m1367().m29472() && this.f63434.m12043()) {
            if (!m44899() || getType() != EnumC8452.f29310) {
                throw new C13391(this, "Extensions of MessageSets must be optional messages.", 0);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44896(C19741 c19741) throws C13391 {
        C9158 c9158 = c19741.f63438;
        C4259 c4259 = c19741.f63434;
        int i = 0;
        if (c4259.m12043()) {
            AbstractC10569 abstractC10569M4884 = c9158.f31130.m4884(c4259.m12039(), c19741, EnumC22563.TYPES_ONLY);
            if (!(abstractC10569M4884 instanceof C2806)) {
                throw new C13391(c19741, "\"" + c4259.m12039() + "\" is not a message type.", i);
            }
            C2806 c2806 = (C2806) abstractC10569M4884;
            c19741.f63441 = c2806;
            if (!c2806.m8529(c4259.m12046())) {
                throw new C13391(c19741, "\"" + c19741.f63441.mo8523() + "\" does not declare " + c4259.m12046() + " as an extension number.", i);
            }
        }
        if (c4259.m12048()) {
            AbstractC10569 abstractC10569M4885 = c9158.f31130.m4884(c4259.m12042(), c19741, EnumC22563.TYPES_ONLY);
            if (!c4259.hasType()) {
                if (abstractC10569M4885 instanceof C2806) {
                    c19741.f63435 = EnumC8452.f29310;
                } else if (abstractC10569M4885 instanceof C7040) {
                    c19741.f63435 = EnumC8452.f29322;
                } else {
                    throw new C13391(c19741, "\"" + c4259.m12042() + "\" is not a type.", i);
                }
            }
            if (c19741.f63435.m22111() == EnumC19035.MESSAGE) {
                if (!(abstractC10569M4885 instanceof C2806)) {
                    throw new C13391(c19741, "\"" + c4259.m12042() + "\" is not a message type.", i);
                }
                c19741.f63437 = (C2806) abstractC10569M4885;
                if (c4259.m12051()) {
                    throw new C13391(c19741, "Messages can't have default values.", i);
                }
            } else if (c19741.f63435.m22111() == EnumC19035.ENUM) {
                if (!(abstractC10569M4885 instanceof C7040)) {
                    throw new C13391(c19741, "\"" + c4259.m12042() + "\" is not an enum type.", i);
                }
                c19741.f63442 = (C7040) abstractC10569M4885;
            } else {
                throw new C13391(c19741, "Field with primitive type has type_name.", i);
            }
        } else if (c19741.f63435.m22111() == EnumC19035.MESSAGE || c19741.f63435.m22111() == EnumC19035.ENUM) {
            throw new C13391(c19741, "Field with message or enum type missing type_name.", i);
        }
        if (c4259.m12049().m31605() && !c19741.m44903()) {
            throw new C13391(c19741, "[packed = true] can only be specified for repeated primitive fields.", i);
        }
        if (c4259.m12051()) {
            if (c19741.mo23408()) {
                throw new C13391(c19741, "Repeated fields cannot have default values.", i);
            }
            try {
                switch (C11980.f40127[c19741.f63435.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c19741.f63439 = Integer.valueOf(C14430.m34698(c4259.m12045()));
                        return;
                    case 4:
                    case 5:
                        c19741.f63439 = Integer.valueOf(C14430.m34702(c4259.m12045()));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        c19741.f63439 = Long.valueOf(C14430.m34703(c4259.m12045()));
                        return;
                    case 9:
                    case 10:
                        c19741.f63439 = Long.valueOf(C14430.m34696(c4259.m12045()));
                        return;
                    case 11:
                        if (c4259.m12045().equals("inf")) {
                            c19741.f63439 = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (c4259.m12045().equals("-inf")) {
                            c19741.f63439 = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (c4259.m12045().equals("nan")) {
                            c19741.f63439 = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            c19741.f63439 = Float.valueOf(c4259.m12045());
                            return;
                        }
                    case 12:
                        if (c4259.m12045().equals("inf")) {
                            c19741.f63439 = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (c4259.m12045().equals("-inf")) {
                            c19741.f63439 = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (c4259.m12045().equals("nan")) {
                            c19741.f63439 = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            c19741.f63439 = Double.valueOf(c4259.m12045());
                            return;
                        }
                    case 13:
                        c19741.f63439 = Boolean.valueOf(c4259.m12045());
                        return;
                    case 14:
                        c19741.f63439 = c4259.m12045();
                        return;
                    case 15:
                        try {
                            c19741.f63439 = C14430.m34701(c4259.m12045());
                            return;
                        } catch (C12313 e) {
                            throw new C13391(c19741, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 16:
                        C21857 c21857M18884 = c19741.f63442.m18884(c4259.m12045());
                        c19741.f63439 = c21857M18884;
                        if (c21857M18884 != null) {
                            return;
                        }
                        throw new C13391(c19741, "Unknown enum default value: \"" + c4259.m12045() + '\"', i);
                    case 17:
                    case 18:
                        throw new C13391(c19741, "Message type had default value.", i);
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new C13391(c19741, "Could not parse default value: \"" + c4259.m12045() + '\"', e2);
            }
            throw new C13391(c19741, "Could not parse default value: \"" + c4259.m12045() + '\"', e2);
        }
        if (c19741.mo23408()) {
            c19741.f63439 = Collections.EMPTY_LIST;
            return;
        }
        int i2 = C11980.f40126[c19741.f63435.m22111().ordinal()];
        if (i2 == 1) {
            c19741.f63439 = c19741.f63442.m18886().get(0);
        } else if (i2 != 2) {
            c19741.f63439 = c19741.f63435.m22111().f61576;
        } else {
            c19741.f63439 = null;
        }
    }

    @Override // l.InterfaceC18930
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6977 mo23409(InterfaceC6977 interfaceC6977, InterfaceC23206 interfaceC23206) {
        return ((InterfaceC22500) interfaceC6977).mergeFrom((InterfaceC1332) interfaceC23206);
    }
}
