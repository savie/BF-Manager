package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۗ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public class C2875 extends AbstractC16042 {
    @Override // l.AbstractC16042
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo8658() {
        Bundle bundleRequireArguments = requireArguments();
        if (bundleRequireArguments.containsKey("preferencesName")) {
            m38031().m15448(bundleRequireArguments.getString("preferencesName"));
        }
        m38030(bundleRequireArguments.getInt("layoutID"));
        m8656((AbstractC12514) m38029());
        ActivityC19126 activity = getActivity();
        if (activity instanceof AbstractActivityC4762) {
            ((AbstractActivityC4762) activity).mo13231(this, m38029());
        }
        if (bundleRequireArguments.containsKey("scrollTo")) {
            String string = bundleRequireArguments.getString("scrollTo");
            C13638.requireNonNull(string);
            m38033(string);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8656(AbstractC12514 abstractC12514) {
        int iM31075 = abstractC12514.m31075();
        for (int i = 0; i < iM31075; i++) {
            C4751 c4751M31078 = abstractC12514.m31078(i);
            if (c4751M31078 instanceof C8426) {
                C8426 c8426 = (C8426) c4751M31078;
                if (!AbstractActivityC4762.f16777.contains(c4751M31078.m13157())) {
                    c8426.mo13141(c8426.m22071());
                }
                c8426.m13144(this);
            } else if (c4751M31078 instanceof C10522) {
                c4751M31078.m13144(this);
            } else if (c4751M31078 instanceof C13365) {
                c4751M31078.m13144(this);
            } else if (c4751M31078 instanceof C2666) {
                c4751M31078.m13144(this);
            } else if (c4751M31078 instanceof AbstractC12514) {
                m8656((AbstractC12514) c4751M31078);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8657(C4751 c4751, Object obj) {
        ActivityC19126 activity = getActivity();
        if (!((activity instanceof AbstractActivityC4762) && ((AbstractActivityC4762) activity).mo13232(this, c4751, obj)) && (c4751 instanceof C8426)) {
            C8426 c8426 = (C8426) c4751;
            if (AbstractActivityC4762.f16777.contains(c4751.m13157())) {
                return;
            }
            c4751.mo13141(c8426.m22074()[c8426.m22072((String) obj)]);
        }
    }
}
