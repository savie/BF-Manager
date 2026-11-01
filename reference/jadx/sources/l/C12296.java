package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12296 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f41119;

    public C12296(boolean z) {
        super(z ? R.string.MT_Protector : R.string.MT_Protector, z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        this.f41119 = z;
        m12944();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        return c21422.m47974("payload") && c11545M47970.m28814("local") && !c11545M47970.m28794();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("payload");
        c11545M47970.m28775("local");
        boolean z = this.f41119;
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        CharSequence charSequenceM12940 = AbstractC4674.m12940(c21422, i);
        if (z) {
            List listM47979 = c21422.m47979();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM12940);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n \n");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), length, spannableStringBuilder.length(), 33);
            int length2 = spannableStringBuilder.length();
            Iterator it = listM47979.iterator();
            long jM21322 = 0;
            while (it.hasNext()) {
                jM21322 += ((C8103) ((InterfaceC2557) it.next())).m21322();
            }
            spannableStringBuilder.append((CharSequence) C16737.m39264(R.string.MT_Protector, C1791.m5873(jM21322)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13932.m33770(15.0f)), length2, spannableStringBuilder.length(), 33);
            charSequenceM12940 = spannableStringBuilder;
        }
        m12943(c21422, i, charSequenceM12940);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c11545M47970.m28798(), new String[0]);
        if (!abstractC20745M15313.mo33975() || abstractC20745M15313.mo8447()) {
            List listM47979 = c21422.m47979();
            int i = C20725.f67443;
            C10142 c10142 = new C10142(C16529.class);
            c10142.m25772(listM47979);
            c10142.m25780(c21422);
            c10142.m25773(c21422.m47960());
            c10142.m25768("targetPath", c11545M47970.m28798());
            c10142.m25763();
            return;
        }
        c21422.m47980().m31000(C16737.m39264(this.f41119 ? R.string.MT_Protector : R.string.MT_Protector, c11545M47970.m28798()), false);
    }
}
