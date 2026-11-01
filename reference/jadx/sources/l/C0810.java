package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֨֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes2.dex */
public class C0810 extends AbstractC3632 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C12660 f3431 = C12660.m31454();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f3432;

    public C0810(CharSequence charSequence) {
        charSequence.getClass();
        this.f3432 = charSequence;
    }

    @Override // l.AbstractC3632
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo3381() {
        return this.f3432.toString();
    }

    @Override // l.AbstractC3632
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 mo3382() {
        return AbstractC22433.m49799(new C21978(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r1
      0x001f: PHI (r1v2 java.lang.CharSequence) = (r1v9 java.lang.CharSequence), (r1v10 java.lang.CharSequence) binds: [B:3:0x0012, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("CharSource.wrap(");
        CharSequence charSequence = this.f3432;
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
        return C22697.m50267(sb, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
