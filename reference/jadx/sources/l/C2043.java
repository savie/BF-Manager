package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2043 extends C0442 {

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final C5772 f6799;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC3425 f6800;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public final C20579 f6801;

    public C2043(AbstractC1890 abstractC1890, boolean z) {
        super(abstractC1890, z);
        this.f6799 = new C5772(this);
        this.f6800 = null;
        this.f6801 = new C20579();
        this.f2013 = "@T+";
        this.f2009 = "@T-";
    }

    @Override // l.C0442
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2258(DataInputStream dataInputStream) {
        int unsignedByte = dataInputStream.readUnsignedByte();
        EnumC24309 enumC24309M54348 = EnumC24309.m54348(unsignedByte);
        if (enumC24309M54348 == null) {
            throw new IOException(C14442.m34864(unsignedByte, "Bad target type: ", " in TypeAnnotationData"));
        }
        C5772 c5772 = this.f6799;
        c5772.m16857(dataInputStream);
        c5772.m16859(enumC24309M54348);
        this.f6800 = c5772.m16856();
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        this.f6369.m32315(C14442.m34864(unsignedByte2, "[TypeAnnotationData.read]: Reading Location (length = ", ")."), new Object[0]);
        this.f6369.m32304("[TypeAnnotationData.read]: [ ", new Object[0]);
        for (int i = 0; i < unsignedByte2; i++) {
            int unsignedByte3 = dataInputStream.readUnsignedByte();
            String strM30858 = EnumC12374.values()[unsignedByte3].m30858();
            char unsignedByte4 = (char) dataInputStream.readUnsignedByte();
            this.f6801.m47171(new C4171(unsignedByte3, unsignedByte4));
            this.f6369.m32304(" " + strM30858 + MotionUtils.EASING_TYPE_FORMAT_START + unsignedByte3 + "," + unsignedByte4 + "), ", new Object[0]);
        }
        this.f6369.m32315("] ", new Object[0]);
        super.mo2258(dataInputStream);
    }

    @Override // l.C0442
    /* JADX INFO: renamed from: ᩶ */
    public final void mo2257() {
        if (isEmpty()) {
            m48009(" { { }");
        } else {
            m48006(" {");
            mo6502(EnumC5619.INLINED_ELEMENT);
            super.mo2257();
        }
        m48009(this.f6800.m11180());
        String string = this.f6801.toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                m48009(string.concat(" "));
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        m48009(l.d);
    }
}
