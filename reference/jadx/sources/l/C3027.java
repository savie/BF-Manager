package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3027 extends C12885 {

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final C9379 f11336;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public final C4417 f11337;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9315 f11338;

    public C3027(AbstractC14504 abstractC14504, boolean z) {
        super(abstractC14504, z);
        this.f11336 = new C9379(this);
        this.f11338 = null;
        this.f11337 = new C4417();
        this.f42851 = "@T+";
        this.f42848 = "@T-";
    }

    @Override // l.C12885
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo9027(DataInputStream dataInputStream) {
        int unsignedByte = dataInputStream.readUnsignedByte();
        EnumC2300 enumC2300M7035 = EnumC2300.m7035(unsignedByte);
        if (enumC2300M7035 == null) {
            throw new IOException(C2271.m6966(unsignedByte, "Bad target type: ", " in TypeAnnotationData"));
        }
        C9379 c9379 = this.f11336;
        c9379.m24056(dataInputStream);
        c9379.m24059(enumC2300M7035);
        this.f11338 = c9379.m24058();
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        this.f47519.m2146(C2271.m6966(unsignedByte2, "[TypeAnnotationData.read]: Reading Location (length = ", ")."), new Object[0]);
        this.f47519.m2160("[TypeAnnotationData.read]: [ ", new Object[0]);
        for (int i = 0; i < unsignedByte2; i++) {
            int unsignedByte3 = dataInputStream.readUnsignedByte();
            String strM33213 = EnumC13591.values()[unsignedByte3].m33213();
            char unsignedByte4 = (char) dataInputStream.readUnsignedByte();
            this.f11337.m12344(new C5123(unsignedByte3, unsignedByte4));
            this.f47519.m2160(" " + strM33213 + MotionUtils.EASING_TYPE_FORMAT_START + unsignedByte3 + "," + unsignedByte4 + "), ", new Object[0]);
        }
        this.f47519.m2146("] ", new Object[0]);
        super.mo9027(dataInputStream);
    }

    @Override // l.C12885
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void mo9028() {
        if (isEmpty()) {
            m18228(" { { }");
        } else {
            m18219(" {");
            mo34919(EnumC23676.INLINED_ELEMENT);
            super.mo9028();
        }
        m18228(this.f11338.m23891());
        String string = this.f11337.toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                m18228(string.concat(" "));
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        m18228(l.d);
    }
}
