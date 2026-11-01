package l;

import android.widget.TextView;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۛۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5800 implements InterfaceC7359, InterfaceC15954, InterfaceC4509, InterfaceC14767 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19684;

    public /* synthetic */ C5800(int i) {
        this.f19684 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15969(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        switch (this.f19684) {
            case 3:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    @Override // l.InterfaceC14767
    /* JADX INFO: renamed from: ۙ */
    public String mo7576(C12257 c12257) {
        String str = c12257.f41013;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Media cache key is missing");
    }
}
