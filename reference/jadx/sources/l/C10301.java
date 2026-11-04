package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10301 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f32878;

    public C10301(boolean z) {
        super(z ? R.string.MT_Protector : R.string.MT_Protector, z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        this.f32878 = z;
        m25621();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        return c12915.m31986("payload") && c8614M31974.m23228("local") && !c8614M31974.m23197();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("payload");
        c8614M31974.m23174("local");
        boolean z = this.f32878;
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        CharSequence charSequenceM25618 = AbstractC9843.m25618(c12915, i);
        if (z) {
            List listM31982 = c12915.m31982();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM25618);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n \n");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), length, spannableStringBuilder.length(), 33);
            int length2 = spannableStringBuilder.length();
            Iterator it = listM31982.iterator();
            long jM10961 = 0;
            while (it.hasNext()) {
                jM10961 += ((C3327) ((InterfaceC2386) it.next())).m10961();
            }
            spannableStringBuilder.append((CharSequence) C21576.m49059(R.string.MT_Protector, C8311.m22393(jM10961)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C6907.m19161(15.0f)), length2, spannableStringBuilder.length(), 33);
            charSequenceM25618 = spannableStringBuilder;
        }
        m25620(c12915, i, charSequenceM25618);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c8614M31974.m23166(), new String[0]);
        if (!abstractC22044M35193.mo2934() || abstractC22044M35193.mo4303()) {
            List listM31982 = c12915.m31982();
            int i = C13678.f43415;
            C8458 c8458 = new C8458(C19252.class);
            c8458.m22723(listM31982);
            c8458.m22731(c12915);
            c8458.m22724(c12915.m31987());
            c8458.m22719("targetPath", c8614M31974.m23166());
            c8458.m22714();
            return;
        }
        c12915.m31979().m40400(C21576.m49059(this.f32878 ? R.string.MT_Protector : R.string.MT_Protector, c8614M31974.m23166()), false);
    }
}
