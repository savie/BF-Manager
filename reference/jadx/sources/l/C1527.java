package l;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.֫ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1527 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Typeface f6226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f6227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14229 f6228 = new C14229(1024);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12900 f6229;

    public C1527(Typeface typeface, C12900 c12900) {
        this.f6226 = typeface;
        this.f6229 = c12900;
        this.f6227 = new char[c12900.m31974() * 2];
        int iM31974 = c12900.m31974();
        for (int i = 0; i < iM31974; i++) {
            C4432 c4432 = new C4432(this, i);
            Character.toChars(c4432.m12366(), this.f6227, i * 2);
            C9535.m24384("invalid metadata codepoint length", c4432.m12368() > 0);
            this.f6228.m34333(c4432, 0, c4432.m12368() - 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1527 m5297(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i = C8684.f29888;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new C1527(typeface, C23401.m51538(mappedByteBuffer));
        } finally {
            int i2 = C8684.f29888;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Typeface m5300() {
        return this.f6226;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m5301() {
        return this.f6229.m31976();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14229 m5298() {
        return this.f6228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m5299() {
        return this.f6227;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12900 m5302() {
        return this.f6229;
    }
}
