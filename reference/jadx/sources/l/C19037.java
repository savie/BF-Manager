package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19037 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8454 f61577;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.᩸᩸᩺] */
    public C19037(ViewOnClickListenerC8454 viewOnClickListenerC8454, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f61577 = viewOnClickListenerC8454;
        m40360(C16737.m39264(R.string.MT_Protector, 10));
        m40354();
        m40339(C20368.f65988);
        final TextView textViewM40362 = m40362();
        textViewM40362.setVisibility(8);
        m40345(new C18331(new Runnable() { // from class: l.᩸᩸᩺
            @Override // java.lang.Runnable
            public final void run() {
                C19037 c19037 = this.f70935;
                int iM23502 = c19037.f61577.f29329.m23502();
                TextView textView = textViewM40362;
                if (iM23502 > 0) {
                    try {
                        if (Integer.parseInt(c19037.m40352()) <= 10) {
                            textView.setVisibility(0);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                textView.setVisibility(8);
            }
        }));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        C9160 c9160 = this.f61577.f29329;
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            m40364();
            return;
        }
        try {
            int i = Integer.parseInt(strM40352);
            if (i < 0) {
                throw new NumberFormatException();
            }
            while (c9160.f31139.m26736() > i) {
                c9160.f31139.m26737();
            }
            c9160.f31139.m26729();
            C9160.m23492(c9160);
            c9160.m23511();
            m40364();
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
