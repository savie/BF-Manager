package l;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.۠᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8914 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f29101;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2948 f29102 = new C2948(1024);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5844 f29103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Typeface f29104;

    public C8914(Typeface typeface, C5844 c5844) {
        this.f29104 = typeface;
        this.f29103 = c5844;
        this.f29101 = new char[c5844.m17028() * 2];
        int iM17028 = c5844.m17028();
        for (int i = 0; i < iM17028; i++) {
            C5098 c5098 = new C5098(this, i);
            Character.toChars(c5098.m15420(), this.f29101, i * 2);
            C11293.m28553("invalid metadata codepoint length", c5098.m15410() > 0);
            this.f29102.m9645(c5098, 0, c5098.m15410() - 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8914 m23825(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i = C21217.f67711;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new C8914(typeface, C9659.m25173(mappedByteBuffer));
        } finally {
            int i2 = C21217.f67711;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Typeface m23828() {
        return this.f29104;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23827() {
        return this.f29103.m17030();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2948 m23830() {
        return this.f29102;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m23826() {
        return this.f29101;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5844 m23829() {
        return this.f29103;
    }
}
