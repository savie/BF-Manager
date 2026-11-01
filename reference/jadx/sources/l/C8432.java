package l;

import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C8432 extends AbstractViewOnClickListenerC6314 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C9186 f29282 = new C9186();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C9186 f29283 = new C9186();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set f29284;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8432(Main main, C12665 c12665) {
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        super(main, strM39288, strM39288, c12665);
        this.f29284 = C0561.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
        if (C0674.f2835) {
            m22084();
        }
        C23186.m51187(main, new C7020(0, this, c12665));
        f29283.m44959(main, new C0943(1, this, c12665));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22085(C8432 c8432, C12665 c12665) {
        if (C0674.f2835) {
            c8432.m22084();
            c12665.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22083(C8432 c8432, C12665 c12665) {
        if (C0674.f2835) {
            c8432.m22084();
            c12665.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۨ */
    public final int mo17413() {
        if (C0674.f2835) {
            return super.mo17413();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22084() {
        ArrayList arrayList = this.f21338;
        arrayList.clear();
        C13308 c13308M51202 = C23186.m51202();
        int iM32808 = c13308M51202.m32808();
        for (int i = 0; i < iM32808; i++) {
            arrayList.add(new C18309(this, this.f47137, c13308M51202.m32811(i)));
        }
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    public final void mo15483(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543, int i) {
        C19015 c19015 = (C19015) abstractViewOnLongClickListenerC22543;
        C18309 c18309 = (C18309) this.f21338.get(i);
        c19015.f61527 = c18309;
        C11072 c11072 = c19015.f73512;
        TextView textView = c19015.f73514;
        c19015.f73517.setText(c18309.f58399.m29681());
        C5546 c5546M29659 = c18309.f58399.m29659();
        if (c5546M29659 == null) {
            textView.setText(c18309.f58399.m29678());
        } else {
            AbstractC12068 abstractC12068M15770 = C5717.m15770(c5546M29659.m15296());
            if (abstractC12068M15770 == null) {
                textView.setText("error " + c18309.f58399.m29678());
            } else {
                textView.setText(abstractC12068M15770.mo4704() + c18309.f58399.m29678());
            }
        }
        c11072.setTag(c18309.f58399);
        c11072.m27921(c18309.m42525());
        if (c18309.f58399.m29659() == null && c18309.f58399.m29661() == null) {
            C11897 c11897 = c18309.f58399;
            if (this.f29284.add(c11897)) {
                C4716.f16636.execute(new RunnableC15488(this, c11897.m29678(), c19015, c11897, 0));
            }
        }
        c19015.itemView.setOnClickListener(c18309);
        this.f21343.m31492((AbstractViewOnLongClickListenerC22543) c19015);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22082(final C8432 c8432, final String str, final C19015 c19015, final C11897 c11897) {
        C0690 c0690M48181;
        Set set = c8432.f29284;
        try {
            try {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
                if (!abstractC20745M15313.mo33975()) {
                    c0690M48181 = C21512.m48160(str, true).m48181();
                } else {
                    c0690M48181 = C3971.f14739.mo7924(new C6794(abstractC20745M15313));
                }
            } catch (RuntimeException unused) {
                c0690M48181 = C21512.m48160(str, true).m48181();
            }
            final C0690 c0690 = c0690M48181;
            C16737.m39273(new Runnable() { // from class: l.᩸᩷᩹
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70897.getClass();
                    C11897 c11898 = c11897;
                    if (str.equals(c11898.m29678())) {
                        C0690 c0691 = c0690;
                        c11898.m29665(c0691);
                        C19015 c19016 = c19015;
                        C18309 c18309 = c19016.f61527;
                        C11072 c11072 = c19016.f73512;
                        if (c18309 != null && c19016.f61527.f58399 == c11898 && c11072.getTag() == c11898) {
                            c11072.m27921(c0691.f2944);
                        }
                    }
                }
            });
        } finally {
            set.remove(c11897);
        }
    }
}
