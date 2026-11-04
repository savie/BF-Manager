package l;

import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4052 extends AbstractViewOnClickListenerC8526 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C17930 f13791 = new C17930();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C17930 f13792 = new C17930();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Set f13793;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4052(Main main, final C9271 c9271) {
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        super(main, strM49088, strM49088, c9271);
        this.f13793 = C4681.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
        if (C17423.f56657) {
            m13031();
        }
        C22961.m51799(main, new C17476(0, this, c9271));
        f13792.m40350(main, new InterfaceC16438() { // from class: l.ܶۡܳ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C4052.m13030(this.f51898, c9271);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13032(C4052 c4052, C9271 c9271) {
        if (C17423.f56657) {
            c4052.m13031();
            c9271.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13030(C4052 c4052, C9271 c9271) {
        if (C17423.f56657) {
            c4052.m13031();
            c9271.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo13033() {
        if (C17423.f56657) {
            return super.mo13033();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m13031() {
        ArrayList arrayList = this.f27858;
        arrayList.clear();
        C5061 c5061M51808 = C22961.m51808();
        int iM15315 = c5061M51808.m15315();
        for (int i = 0; i < iM15315; i++) {
            arrayList.add(new C6290(this, this.f22654, c5061M51808.m15320(i)));
        }
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۙ */
    public final void mo3565(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544, int i) {
        final C24190 c24190 = (C24190) abstractViewOnLongClickListenerC5544;
        C6290 c6290 = (C6290) this.f27858.get(i);
        c24190.f78336 = c6290;
        C3034 c3034 = c24190.f19265;
        TextView textView = c24190.f19262;
        c24190.f19266.setText(c6290.f21355.m25122());
        C8877 c8877M25121 = c6290.f21355.m25121();
        if (c8877M25121 == null) {
            textView.setText(c6290.f21355.m25117());
        } else {
            AbstractC0148 abstractC0148M20792 = C7606.m20792(c8877M25121.m23755());
            if (abstractC0148M20792 == null) {
                textView.setText("error " + c6290.f21355.m25117());
            } else {
                textView.setText(abstractC0148M20792.mo1332() + c6290.f21355.m25117());
            }
        }
        c3034.setTag(c6290.f21355);
        c3034.m9864(c6290.m17972());
        if (c6290.f21355.m25121() == null && c6290.f21355.m25104() == null) {
            final C9622 c9622 = c6290.f21355;
            if (this.f13793.add(c9622)) {
                final String strM25117 = c9622.m25117();
                C5261.f18540.execute(new Runnable() { // from class: l.᩵ۡܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4052.m13029(this.f65553, strM25117, c24190, c9622);
                    }
                });
            }
        }
        c24190.itemView.setOnClickListener(c6290);
        this.f27860.m24477((AbstractViewOnLongClickListenerC5544) c24190);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13029(final C4052 c4052, final String str, final C24190 c24190, final C9622 c9622) {
        C20613 c20613M23976;
        Set set = c4052.f13793;
        try {
            try {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
                if (!abstractC22044M35193.mo2934()) {
                    c20613M23976 = C8969.m23952(str, true).m23976();
                } else {
                    c20613M23976 = C13461.f42854.mo3626(new C6004(abstractC22044M35193));
                }
            } catch (RuntimeException unused) {
                c20613M23976 = C8969.m23952(str, true).m23976();
            }
            final C20613 c20613 = c20613M23976;
            C21576.m49068(new Runnable() { // from class: l.ۨۡܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39418.getClass();
                    C9622 c9623 = c9622;
                    if (str.equals(c9623.m25117())) {
                        C20613 c20614 = c20613;
                        c9623.m25113(c20614);
                        C24190 c24191 = c24190;
                        C6290 c6290 = c24191.f78336;
                        C3034 c3034 = c24191.f19265;
                        if (c6290 != null && c24191.f78336.f21355 == c9623 && c3034.getTag() == c9623) {
                            c3034.m9864(c20614.f66117);
                        }
                    }
                }
            });
        } finally {
            set.remove(c9622);
        }
    }
}
