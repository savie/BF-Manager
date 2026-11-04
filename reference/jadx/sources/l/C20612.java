package l;

import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.᩵ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C20612 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f66038;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f66039;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f66040;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f66041;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f66042;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f66043;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20612(AbstractActivityC17204 abstractActivityC17204, Matcher matcher, AbstractActivityC17204 abstractActivityC17205, C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259) {
        super(abstractActivityC17204, -1);
        this.f66039 = abstractActivityC17205;
        this.f66038 = c23255;
        this.f66041 = c23256;
        this.f66043 = c23257;
        this.f66042 = c23258;
        this.f66040 = c23259;
        if (matcher.find()) {
            m22924((CharSequence) matcher.group(2));
        }
        TextView textViewM22938 = m22938();
        textViewM22938.setTextColor(C3296.f10779);
        textViewM22938.setLineSpacing(0.0f, 1.1f);
        textViewM22938.setTextSize(12.0f);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (!strTrim.matches("[a-z0-9]{32}")) {
            m22952(R.string.MT_Protector);
            return;
        }
        m22951();
        new C1967(this.f66039, new C3458(this, strTrim), this.f66043, this.f66038, this.f66041).m8197();
    }
}
