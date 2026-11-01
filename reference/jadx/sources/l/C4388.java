package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4388 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C15070 f15635 = C15070.m36102(new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector});

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f15636;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15637;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f15638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9598 f15639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f15640;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f15641;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f15642;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9598 f15643;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f15644;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4388 m12241() {
        C4388 c4388 = new C4388();
        c4388.f15639 = new C9598();
        c4388.f15643 = new C9598();
        c4388.f15637 = 7;
        return c4388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12245(int i, String str) {
        String strM39288 = C16737.m39288(i);
        this.f15636 = str;
        C9598 c9598 = this.f15639;
        c9598.f32339 = null;
        c9598.f32342 = strM39288;
        c9598.f32343 = strM39288;
        if (c9598.f32344 == null) {
            c9598.f32344 = strM39288;
        }
        c9598.f32341 = Boolean.TRUE;
        c9598.f32338 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12250(int i, String str) {
        String strM39288 = C16737.m39288(i);
        this.f15642 = str;
        C9598 c9598 = this.f15643;
        c9598.f32339 = null;
        c9598.f32342 = strM39288;
        c9598.f32343 = strM39288;
        if (c9598.f32344 == null) {
            c9598.f32344 = strM39288;
        }
        c9598.f32341 = Boolean.TRUE;
        c9598.f32338 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12246(String str) {
        this.f15639.f32340 = str;
        this.f15643.f32340 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12242(String str) {
        this.f15639.f32344 = str;
        this.f15643.f32344 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12244(int i) {
        int iIndexOf = f15635.indexOf(i);
        this.f15638 = iIndexOf;
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12249(String str) {
        this.f15644 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12247(ArrayList arrayList) {
        this.f15641 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12243() {
        this.f15637 = 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12251(String str) {
        this.f15640 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12248(AbstractActivityC12483 abstractActivityC12483) {
        C9598 c9598 = this.f15643;
        C9598 c9599 = this.f15639;
        if (this.f15636 != null) {
            AbstractC20745 abstractC20745M46690 = C11904.f39937.m46690("diffText1");
            try {
                abstractC20745M46690.m46735(this.f15636);
            } catch (IOException e) {
                abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
            }
            c9599.f32339 = abstractC20745M46690;
        }
        if (this.f15642 != null) {
            AbstractC20745 abstractC20745M46691 = C11904.f39937.m46690("diffText2");
            try {
                abstractC20745M46691.m46735(this.f15642);
            } catch (IOException e2) {
                abstractActivityC12483.m31002(e2, (DialogInterface.OnDismissListener) null);
            }
            c9598.f32339 = abstractC20745M46691;
        }
        if (c9599.f32339 == null || c9599.f32342 == null || c9599.f32343 == null || c9599.f32344 == null || c9599.f32341 == null || c9598.f32339 == null || c9598.f32342 == null || c9598.f32343 == null || c9598.f32344 == null || c9598.f32341 == null) {
            throw new IllegalArgumentException();
        }
        Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC4471.class);
        intent.putExtra("arg1", c9599.m24462().toString());
        intent.putExtra("arg2", c9598.m24462().toString());
        intent.putExtra("moreInfoFlags", this.f15637);
        intent.putExtra("titleIndex", this.f15638);
        String str = this.f15640;
        if (str != null) {
            intent.putExtra("moreInfoReplacedPath", str);
        }
        String str2 = this.f15644;
        if (str2 != null) {
            intent.putExtra("subtitle", str2);
        }
        ArrayList<String> arrayList = this.f15641;
        if (arrayList != null) {
            intent.putStringArrayListExtra("customIgnoreRegexes", arrayList);
        }
        abstractActivityC12483.startActivity(intent);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m12240(int i) {
        C15070 c15070 = f15635;
        if (i < 0 || i >= c15070.size()) {
            i = 0;
        }
        return c15070.getInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12237(Main main, final C3246 c3246) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        m12238(c3246.f12072, c3246.f12075, editText, editText2);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(main);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14537(0, c3246, main));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.֫۬ۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3246 c3247 = c3246;
                c3247.m9718();
                C4388.m12238(c3247.f12072, c3247.f12075, editText, editText2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12239(C3246 c3246, AbstractActivityC12483 abstractActivityC12483) {
        c3246.m9717();
        C4388 c4388M12241 = m12241();
        AbstractC20745 abstractC20745 = c3246.f12071;
        c4388M12241.f15636 = null;
        C9598 c9598 = c4388M12241.f15639;
        c9598.f32339 = abstractC20745;
        if (c9598.f32342 == null) {
            c9598.f32342 = abstractC20745.mo33986();
        }
        if (c9598.f32343 == null) {
            c9598.f32343 = abstractC20745.getName();
        }
        if (c9598.f32344 == null) {
            c9598.f32344 = abstractC20745.getName();
        }
        if (c9598.f32341 == null) {
            c9598.f32341 = Boolean.FALSE;
        }
        c9598.f32338 = false;
        AbstractC20745 abstractC20746 = c3246.f12074;
        c4388M12241.f15642 = null;
        C9598 c9599 = c4388M12241.f15643;
        c9599.f32339 = abstractC20746;
        if (c9599.f32342 == null) {
            c9599.f32342 = abstractC20746.mo33986();
        }
        if (c9599.f32343 == null) {
            c9599.f32343 = abstractC20746.getName();
        }
        if (c9599.f32344 == null) {
            c9599.f32344 = abstractC20746.getName();
        }
        if (c9599.f32341 == null) {
            c9599.f32341 = Boolean.FALSE;
        }
        c9599.f32338 = false;
        c4388M12241.m12248(abstractActivityC12483);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12238(String str, String str2, EditText editText, EditText editText2) {
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
        editText.setText(name);
        editText2.setText(name2);
    }
}
