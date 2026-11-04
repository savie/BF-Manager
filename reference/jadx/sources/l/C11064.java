package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۤᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11064 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f34898;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20956 f34899;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f34900;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f34901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11999 f34902;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f34903;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Runnable f34904;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f34906;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f34897 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7424 f34905 = new C7424(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27955(C11064 c11064, int i) {
        c11064.getClass();
        boolean z = i == 0;
        AbstractActivityC17204 abstractActivityC17204 = c11064.f34898;
        if (c11064.m27972() && c11064.f34899 == null && !c11064.f34903) {
            c11064.f34899 = ViewOnClickListenerC11499.m28898(abstractActivityC17204.mo16524(), "mcp-file-rule-" + UUID.randomUUID(), new C10406(c11064, z));
            if (abstractActivityC17204 instanceof ActivityC20852) {
                ((ActivityC20852) abstractActivityC17204).m47679(true);
            }
            try {
                if (z) {
                    C20956 c20956 = c11064.f34899;
                    c20956.getClass();
                    c20956.m37643(0, R.string.MT_Protector, (String) null, (String) null, (String[]) null, (Bundle) null);
                } else {
                    C20956 c20957 = c11064.f34899;
                    c20957.getClass();
                    C20956.m47909(c20957, R.string.MT_Protector, null, null, 14);
                }
            } catch (RuntimeException e) {
                c11064.m27965();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27957(C11064 c11064, C0911 c0911) {
        c11064.getClass();
        C0492.m2375(c0911.f3413);
        c11064.m27968();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27961(final C11064 c11064, int[] iArr, final C0911 c0911, String str, final boolean z) {
        c11064.getClass();
        final EnumC7623 enumC7623 = EnumC7623.values()[iArr[0]];
        EnumC7623 enumC7624 = ((C0911) C7750.m21093(1, C0492.m2383().f29600)).f3412;
        if (!c0911.m3682() || enumC7623 != EnumC7623.READ_WRITE || enumC7624 == enumC7623) {
            try {
                if (z) {
                    C0492.m2371(c0911, enumC7623);
                } else {
                    C0492.m2370(c0911.f3413, enumC7623);
                }
                c11064.m27968();
                return;
            } catch (IllegalArgumentException unused) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        }
        AbstractActivityC17204 abstractActivityC17204 = c11064.f34898;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(str);
        c2361.m8000(R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩸ۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C11064.m27958(this.f26951, c0911, enumC7623, z);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    public C11064(AbstractActivityC17204 abstractActivityC17204) {
        this.f34898 = abstractActivityC17204;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11064 m27953(View view, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        C11064 c11064 = new C11064(abstractActivityC17204);
        c11064.f34906 = dialogInterfaceC8327;
        C5817 c5817 = (C5817) view.findViewById(R.id.MT_Protector);
        c5817.m16967();
        c5817.setAdapter(c11064.f34905);
        C11999 c11999 = new C11999(new C19357(c11064));
        c11064.f34902 = c11999;
        c11999.m30173((C25227) c5817);
        c11064.m27968();
        return c11064;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m27970(C11064 c11064, int i) {
        return i > 0 && i < c11064.f34897.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27974() {
        m27968();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m27968() {
        String str;
        C9113 c9113M2383 = C0492.m2383();
        StringBuilder sb = new StringBuilder();
        AbstractActivityC17204 abstractActivityC17204 = this.f34898;
        sb.append(abstractActivityC17204.getString(R.string.MT_Protector));
        if (C0492.m2381()) {
            str = "\n\n" + abstractActivityC17204.getString(R.string.MT_Protector);
        } else {
            str = "";
        }
        sb.append(str);
        this.f34901 = sb.toString();
        ArrayList arrayList = this.f34897;
        arrayList.clear();
        arrayList.addAll(c9113M2383.f29600);
        this.f34905.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27973() {
        if (m27972() && this.f34899 == null && !this.f34903) {
            int i = DialogInterfaceC8327.f27315;
            AbstractActivityC17204 abstractActivityC17204 = this.f34898;
            C2361 c2361 = new C2361(abstractActivityC17204);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8014(new String[]{abstractActivityC17204.getString(R.string.MT_Protector), abstractActivityC17204.getString(R.string.MT_Protector)}, new DialogInterface.OnClickListener() { // from class: l.ܰ᩸ۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C11064.m27955(this.f48623, i2);
                }
            });
            c2361.m8016();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27956(C11064 c11064, String str, boolean z) {
        c11064.f34903 = true;
        new C9660(c11064, str, z).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m27972() {
        if (this.f34900 || !this.f34906.m22434()) {
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f34898;
        return (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m27965() {
        C20956 c20956 = this.f34899;
        if (c20956 != null) {
            c20956.m37642();
            this.f34899 = null;
            AbstractActivityC17204 abstractActivityC17204 = this.f34898;
            if (abstractActivityC17204 instanceof ActivityC20852) {
                ((ActivityC20852) abstractActivityC17204).m47679(false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27975() {
        this.f34900 = true;
        m27965();
        Runnable runnable = this.f34904;
        if (runnable != null) {
            runnable.run();
            this.f34904 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27959(final C11064 c11064, final C0911 c0911, final boolean z) {
        AbstractActivityC17204 abstractActivityC17204 = c11064.f34898;
        final int[] iArr = {(z ? EnumC7623.READ_ONLY : c0911.f3412).ordinal()};
        final String string = c0911.m3682() ? abstractActivityC17204.getString(R.string.MT_Protector) : c0911.f3413;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(string);
        c2361.m8013(new String[]{c11064.m27951(EnumC7623.READ_ONLY), c11064.m27951(EnumC7623.READ_WRITE), c11064.m27951(EnumC7623.DENY)}, iArr[0], new DialogInterfaceOnClickListenerC21595(iArr, 0));
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩸ۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C11064.m27961(this.f60519, iArr, c0911, string, z);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (!z && !c0911.m3682()) {
            c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩸ۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C11064.m27957(this.f2630, c0911);
                }
            });
        }
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27958(C11064 c11064, C0911 c0911, EnumC7623 enumC7623, boolean z) {
        c11064.getClass();
        try {
            if (z) {
                C0492.m2371(c0911, enumC7623);
            } else {
                C0492.m2370(c0911.f3413, enumC7623);
            }
            c11064.m27968();
        } catch (IllegalArgumentException unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m27951(EnumC7623 enumC7623) {
        int i;
        int i2 = C2949.f9634[enumC7623.ordinal()];
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
        return this.f34898.getString(i);
    }
}
