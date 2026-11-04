package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2459 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7887 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C14763 f7888 = C14763.m35499(new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector});

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7889;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0968 f7890;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f7891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f7892;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f7893;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f7894;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f7895;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0968 f7896;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7897;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2459 m8296() {
        C2459 c2459 = new C2459();
        c2459.f7890 = new C0968();
        c2459.f7896 = new C0968();
        c2459.f7897 = 7;
        return c2459;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8299(int i, String str) {
        String strM49088 = C21576.m49088(i);
        this.f7893 = str;
        C0968 c0968 = this.f7890;
        c0968.f3543 = null;
        c0968.f3538 = strM49088;
        c0968.f3542 = strM49088;
        if (c0968.f3540 == null) {
            c0968.f3540 = strM49088;
        }
        c0968.f3541 = Boolean.TRUE;
        c0968.f3539 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8304(int i, String str) {
        String strM49088 = C21576.m49088(i);
        this.f7891 = str;
        C0968 c0968 = this.f7896;
        c0968.f3543 = null;
        c0968.f3538 = strM49088;
        c0968.f3542 = strM49088;
        if (c0968.f3540 == null) {
            c0968.f3540 = strM49088;
        }
        c0968.f3541 = Boolean.TRUE;
        c0968.f3539 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8300(String str) {
        this.f7890.f3537 = str;
        this.f7896.f3537 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8306(String str) {
        this.f7890.f3540 = str;
        this.f7896.f3540 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8298(int i) {
        int iIndexOf = f7888.indexOf(i);
        this.f7889 = iIndexOf;
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8303(String str) {
        this.f7894 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8301(ArrayList arrayList) {
        this.f7892 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8297() {
        this.f7897 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8305(String str) {
        this.f7895 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8302(AbstractActivityC17204 abstractActivityC17204) {
        C0968 c0968 = this.f7896;
        C0968 c0969 = this.f7890;
        if (this.f7893 != null) {
            AbstractC22044 abstractC22044M49876 = C6382.f21562.m49876("diffText1");
            try {
                abstractC22044M49876.m49879(this.f7893);
            } catch (IOException e) {
                abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
            }
            c0969.f3543 = abstractC22044M49876;
        }
        if (this.f7891 != null) {
            AbstractC22044 abstractC22044M49877 = C6382.f21562.m49876("diffText2");
            try {
                abstractC22044M49877.m49879(this.f7891);
            } catch (IOException e2) {
                abstractActivityC17204.m40401(e2, (DialogInterface.OnDismissListener) null);
            }
            c0968.f3543 = abstractC22044M49877;
        }
        if (c0969.f3543 == null || c0969.f3538 == null || c0969.f3542 == null || c0969.f3540 == null || c0969.f3541 == null || c0968.f3543 == null || c0968.f3538 == null || c0968.f3542 == null || c0968.f3540 == null || c0968.f3541 == null) {
            throw new IllegalArgumentException();
        }
        Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC2350.class);
        intent.putExtra("arg1", c0969.m3842().toString());
        intent.putExtra("arg2", c0968.m3842().toString());
        intent.putExtra("moreInfoFlags", this.f7897);
        intent.putExtra("titleIndex", this.f7889);
        String str = this.f7895;
        if (str != null) {
            intent.putExtra("moreInfoReplacedPath", str);
        }
        String str2 = this.f7894;
        if (str2 != null) {
            intent.putExtra("subtitle", str2);
        }
        ArrayList<String> arrayList = this.f7892;
        if (arrayList != null) {
            intent.putStringArrayListExtra("customIgnoreRegexes", arrayList);
        }
        abstractActivityC17204.startActivity(intent);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m8295(int i) {
        C14763 c14763 = f7888;
        if (i < 0 || i >= c14763.size()) {
            i = 0;
        }
        return c14763.getInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8294(C9170 c9170, AbstractActivityC17204 abstractActivityC17204) {
        c9170.m24303();
        C2459 c2459M8296 = m8296();
        AbstractC22044 abstractC22044 = c9170.f29765;
        c2459M8296.f7893 = null;
        C0968 c0968 = c2459M8296.f7890;
        c0968.f3543 = abstractC22044;
        if (c0968.f3538 == null) {
            c0968.f3538 = abstractC22044.mo4294();
        }
        if (c0968.f3542 == null) {
            c0968.f3542 = abstractC22044.getName();
        }
        if (c0968.f3540 == null) {
            c0968.f3540 = abstractC22044.getName();
        }
        if (c0968.f3541 == null) {
            c0968.f3541 = Boolean.FALSE;
        }
        c0968.f3539 = false;
        AbstractC22044 abstractC22045 = c9170.f29769;
        c2459M8296.f7891 = null;
        C0968 c0969 = c2459M8296.f7896;
        c0969.f3543 = abstractC22045;
        if (c0969.f3538 == null) {
            c0969.f3538 = abstractC22045.mo4294();
        }
        if (c0969.f3542 == null) {
            c0969.f3542 = abstractC22045.getName();
        }
        if (c0969.f3540 == null) {
            c0969.f3540 = abstractC22045.getName();
        }
        if (c0969.f3541 == null) {
            c0969.f3541 = Boolean.FALSE;
        }
        c0969.f3539 = false;
        c2459M8296.m8302(abstractActivityC17204);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8293(String str, String str2, C23255 c23255, C23255 c23256) {
        File file = new File(str);
        File file2 = new File(str2);
        String name = file.getName();
        String name2 = file2.getName();
        while (name.equals(name2)) {
            file = file.getParentFile();
            file2 = file2.getParentFile();
            if (file == null || file2 == null) {
                break;
            }
            name = file.getName() + "/" + name;
            name2 = file2.getName() + "/" + name2;
        }
        c23255.mo52335((CharSequence) name);
        c23256.mo52335((CharSequence) name2);
    }
}
