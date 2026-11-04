package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes.dex */
public class C22920 extends AbstractC15460 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0942 f74487 = C0942.m3762();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f74488;

    public C22920(CharSequence charSequence) {
        charSequence.getClass();
        this.f74488 = charSequence;
    }

    @Override // l.AbstractC15460
    /* JADX INFO: renamed from: ۙ */
    public final String mo37016() {
        return this.f74488.toString();
    }

    @Override // l.AbstractC15460
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1928 mo37017() {
        return AbstractC1928.m6614(new C10985(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r1
      0x001f: PHI (r1v2 java.lang.CharSequence) = (r1v9 java.lang.CharSequence), (r1v10 java.lang.CharSequence) binds: [B:3:0x0012, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("CharSource.wrap(");
        CharSequence charSequence = this.f74488;
        charSequence.getClass();
        int length = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length <= 30) {
            string2 = charSequence.toString();
            if (string2.length() > 30) {
                string = string2;
                charSequence2 = string2;
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append(charSequence2, 0, 27);
                sb2.append("...");
                string = sb2.toString();
            }
        } else {
            string = string2;
            charSequence2 = string2;
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append(charSequence2, 0, 27);
            sb3.append("...");
            string = sb3.toString();
        }
        string = string2;
        charSequence2 = string2;
        return C8947.m23910(sb, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
