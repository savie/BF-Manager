package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩷ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20824 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4647 f67669;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f67670;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f67672;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Runnable f67673;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f67674;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f67675;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23566 f67676;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f67678;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67671 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19413 f67677 = new C19413(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46834(C20824 c20824, int i) {
        c20824.getClass();
        boolean z = i == 0;
        AbstractActivityC12483 abstractActivityC12483 = c20824.f67672;
        if (c20824.m46829() && c20824.f67676 == null && !c20824.f67678) {
            c20824.f67676 = ViewOnClickListenerC8374.m21925(abstractActivityC12483.mo4078(), "mcp-file-rule-" + UUID.randomUUID(), new C15180(c20824, z));
            if (abstractActivityC12483 instanceof ActivityC7109) {
                ((ActivityC7109) abstractActivityC12483).m18998(true);
            }
            try {
                if (z) {
                    C23566 c23566 = c20824.f67676;
                    c23566.getClass();
                    c23566.m46684(0, R.string.MT_Protector, (String) null, (String) null, (String[]) null, (Bundle) null);
                } else {
                    C23566 c23567 = c20824.f67676;
                    c23567.getClass();
                    C23566.m51966(c23567, R.string.MT_Protector, null, null, 14);
                }
            } catch (RuntimeException e) {
                c20824.m46847();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46836(C20824 c20824, C9422 c9422) {
        c20824.getClass();
        C16259.m38423(c9422.f31925);
        c20824.m46842();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46840(final C20824 c20824, int[] iArr, final C9422 c9422, String str, final boolean z) {
        c20824.getClass();
        final EnumC23533 enumC23533 = EnumC23533.values()[iArr[0]];
        EnumC23533 enumC23534 = ((C9422) C3012.m8974(1, C16259.m38424().f11562)).f31924;
        if (!c9422.m24180() || enumC23533 != EnumC23533.READ_WRITE || enumC23534 == enumC23533) {
            try {
                if (z) {
                    C16259.m38417(c9422, enumC23533);
                } else {
                    C16259.m38416(c9422.f31925, enumC23533);
                }
                c20824.m46842();
                return;
            } catch (IllegalArgumentException unused) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        }
        AbstractActivityC12483 abstractActivityC12483 = c20824.f67672;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(str);
        c8067.m21253(R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۧ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C20824.m46837(this.f22620, c9422, enumC23533, z);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    public C20824(AbstractActivityC12483 abstractActivityC12483) {
        this.f67672 = abstractActivityC12483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20824 m46833(View view, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        C20824 c20824 = new C20824(abstractActivityC12483);
        c20824.f67670 = dialogInterfaceC19356;
        C21423 c21423 = (C21423) view.findViewById(R.id.MT_Protector);
        c21423.m47992();
        c21423.setAdapter(c20824.f67677);
        C4647 c4647 = new C4647(new C22941(c20824));
        c20824.f67669 = c4647;
        c4647.m12825((C17492) c21423);
        c20824.m46842();
        return c20824;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m46846(C20824 c20824, int i) {
        return i > 0 && i < c20824.f67671.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46850() {
        m46842();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m46842() {
        String str;
        C3070 c3070M38424 = C16259.m38424();
        StringBuilder sb = new StringBuilder();
        AbstractActivityC12483 abstractActivityC12483 = this.f67672;
        sb.append(abstractActivityC12483.getString(R.string.MT_Protector));
        if (C16259.m38421()) {
            str = "\n\n" + abstractActivityC12483.getString(R.string.MT_Protector);
        } else {
            str = "";
        }
        sb.append(str);
        this.f67674 = sb.toString();
        ArrayList arrayList = this.f67671;
        arrayList.clear();
        arrayList.addAll(c3070M38424.f11562);
        this.f67677.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46849() {
        if (m46829() && this.f67676 == null && !this.f67678) {
            int i = DialogInterfaceC19356.f62401;
            AbstractActivityC12483 abstractActivityC12483 = this.f67672;
            C8067 c8067 = new C8067(abstractActivityC12483);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21267(new String[]{abstractActivityC12483.getString(R.string.MT_Protector), abstractActivityC12483.getString(R.string.MT_Protector)}, new DialogInterface.OnClickListener() { // from class: l.֨ۧ֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C20824.m46834(this.f4916, i2);
                }
            });
            c8067.m21269();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46835(C20824 c20824, String str, boolean z) {
        c20824.f67678 = true;
        new C18001(c20824, str, z).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m46829() {
        if (this.f67675 || !this.f67670.m44375()) {
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f67672;
        return (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m46847() {
        C23566 c23566 = this.f67676;
        if (c23566 != null) {
            c23566.m46683();
            this.f67676 = null;
            AbstractActivityC12483 abstractActivityC12483 = this.f67672;
            if (abstractActivityC12483 instanceof ActivityC7109) {
                ((ActivityC7109) abstractActivityC12483).m18998(false);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46851() {
        this.f67675 = true;
        m46847();
        Runnable runnable = this.f67673;
        if (runnable != null) {
            runnable.run();
            this.f67673 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46838(final C20824 c20824, final C9422 c9422, final boolean z) {
        AbstractActivityC12483 abstractActivityC12483 = c20824.f67672;
        final int[] iArr = {(z ? EnumC23533.READ_ONLY : c9422.f31924).ordinal()};
        final String string = c9422.m24180() ? abstractActivityC12483.getString(R.string.MT_Protector) : c9422.f31925;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(string);
        c8067.m21266(new String[]{c20824.m46831(EnumC23533.READ_ONLY), c20824.m46831(EnumC23533.READ_WRITE), c20824.m46831(EnumC23533.DENY)}, iArr[0], new DialogInterfaceOnClickListenerC3725(2, iArr));
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۧ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C20824.m46840(this.f43549, iArr, c9422, string, z);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z && !c9422.m24180()) {
            c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۧ֨
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C20824.m46836(this.f14548, c9422);
                }
            });
        }
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46837(C20824 c20824, C9422 c9422, EnumC23533 enumC23533, boolean z) {
        c20824.getClass();
        try {
            if (z) {
                C16259.m38417(c9422, enumC23533);
            } else {
                C16259.m38416(c9422.f31925, enumC23533);
            }
            c20824.m46842();
        } catch (IllegalArgumentException unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m46831(EnumC23533 enumC23533) {
        int i;
        int i2 = C18707.f60683[enumC23533.ordinal()];
        if (i2 == 1) {
            i = R.string.MT_Protector;
        } else if (i2 == 2) {
            i = R.string.MT_Protector;
        } else {
            if (i2 != 3) {
                throw new IncompatibleClassChangeError();
            }
            i = R.string.MT_Protector;
        }
        return this.f67672.getString(i);
    }
}
