package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes.dex */
public class C23814 extends AbstractC18168 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C11114 f77002;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f77003;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C23566 f77004;

    public C23814(Context context) {
        super(context);
        this.f77002 = new C11114();
        m52481((AttributeSet) null);
    }

    public C23814(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77002 = new C11114();
        m52481(attributeSet);
    }

    public C23814(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77002 = new C11114();
        m52481(attributeSet);
    }

    public C23814(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f77002 = new C11114();
        m52481(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52485(C23814 c23814, AbstractActivityC12483 abstractActivityC12483, String str) {
        if (c23814.f77002.f37733 == null) {
            return;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        ApplicationC0716.f2992.edit().putString("ffpp", abstractC20745M15313.getParent()).apply();
        new C6174(c23814, abstractActivityC12483, abstractC20745M15313, str).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52481(AttributeSet attributeSet) {
        int resourceId = R.array.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = m13133().obtainStyledAttributes(attributeSet, C8270.f28754);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.array.MT_Protector);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f77003 = resourceId;
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(m13133());
        C13638.requireNonNull(abstractActivityC12483);
        this.f77004 = ViewOnClickListenerC8374.m21926(abstractActivityC12483, new C18748(this, abstractActivityC12483));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52480(SharedPreferences sharedPreferences, String str) {
        int i;
        String[] stringArray = m13133().getResources().getStringArray(this.f77003);
        if (stringArray.length == 0) {
            stringArray = new String[]{C16737.m39288(R.string.MT_Protector)};
        }
        String[] strArr = (String[]) Arrays.copyOf(stringArray, stringArray.length + 1);
        C11114 c11114 = this.f77002;
        c11114.f37728 = strArr;
        c11114.f37730 = stringArray.length;
        try {
            try {
                i = sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(sharedPreferences.getString(str, null));
                sharedPreferences.edit().putInt(str, i).apply();
            }
        } catch (Exception unused2) {
            sharedPreferences.edit().remove(str).apply();
            i = 0;
        }
        c11114.f37731 = i;
        c11114.f37729 = sharedPreferences.getString(str + "_custom", null);
        c11114.f37726 = sharedPreferences.getString(str + "_custom_md5", null);
        AbstractC20745 abstractC20745 = C11904.f39938;
        c11114.f37732 = abstractC20745.m46690(str + "_custom.dat");
        c11114.f37727 = abstractC20745.m46690(str + "_custom.dat.tmp");
        c11114.f37725 = false;
        if (c11114.f37729 != null && (c11114.f37726 == null || !c11114.f37732.mo33975())) {
            c11114.f37729 = null;
            c11114.f37726 = null;
        }
        if (c11114.f37729 == null && c11114.f37732.mo33975()) {
            c11114.f37732.mo24644();
        }
        int i2 = c11114.f37731;
        if (i2 < 0 || i2 > c11114.f37730) {
            c11114.f37731 = 0;
        }
        String strM39288 = c11114.f37729;
        if (strM39288 == null && c11114.f37731 == c11114.f37730) {
            c11114.f37731 = 0;
        }
        String[] strArr2 = c11114.f37728;
        int i3 = c11114.f37730;
        if (strM39288 == null) {
            strM39288 = C16737.m39288(R.string.MT_Protector);
        }
        strArr2[i3] = C16737.m39264(R.string.MT_Protector, strM39288);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۧ */
    public final void mo4129() {
        super.mo4129();
        m52480(m42292(), m13157());
        C11114 c11114 = this.f77002;
        mo13141((CharSequence) c11114.f37728[c11114.f37731]);
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(final AbstractActivityC12483 abstractActivityC12483) {
        final SharedPreferences sharedPreferencesM42292 = m42292();
        final String strM13157 = m13157();
        m52480(sharedPreferencesM42292, strM13157);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21277(m13158());
        C11114 c11114 = this.f77002;
        c8067BuildDialog.m21266(c11114.f37728, c11114.f37731, new DialogInterfaceOnClickListenerC3746(3, this));
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6569(2, this));
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.֡ܽۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C23814.m52482(this.f2222);
            }
        });
        c11114.f37733 = c8067BuildDialog.m21269();
        c11114.m28030();
        c11114.f37733.m44361().setOnClickListener(new ViewOnClickListenerC16758(0, this));
        c11114.f37733.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.۫ܽۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23814.m52484(this.f41895, abstractActivityC12483, sharedPreferencesM42292, strM13157);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52483(C23814 c23814, int i) {
        C11114 c11114 = c23814.f77002;
        c11114.f37731 = i;
        c11114.m28030();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52487(C23814 c23814) {
        C11114 c11114 = c23814.f77002;
        if (c11114.f37725) {
            c11114.f37727.mo24644();
            c11114.f37725 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52482(C23814 c23814) {
        C11114 c11114 = c23814.f77002;
        if (c11114.f37725) {
            c11114.f37727.mo24644();
            c11114.f37725 = false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52486(C23814 c23814) {
        String string = ApplicationC0716.f2992.getString("ffpp", null);
        if (TextUtils.isEmpty(string)) {
            string = C11904.f39934.mo33986();
        }
        C23566 c23566 = c23814.f77004;
        c23566.getClass();
        C23566.m51966(c23566, R.string.MT_Protector, string, new String[]{"ttf", "ttc", "otf", "woff"}, 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52484(C23814 c23814, AbstractActivityC12483 abstractActivityC12483, SharedPreferences sharedPreferences, String str) {
        C11114 c11114 = c23814.f77002;
        if (c11114.f37731 != c11114.f37730) {
            if (c11114.f37725) {
                c11114.f37727.mo24644();
                c11114.f37725 = false;
            }
            sharedPreferences.edit().putInt(str, c11114.f37731).apply();
        } else {
            if (c11114.f37729 == null) {
                c11114.f37733.m44373().setEnabled(false);
                return;
            }
            if (c11114.f37725) {
                try {
                    c11114.f37727.m46699(c11114.f37732, (Runnable) null);
                } catch (IOException e) {
                    abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            sharedPreferences.edit().putInt(str, c11114.f37731).putString(C15489.m37076(str, "_custom"), c11114.f37729).putString(C15489.m37076(str, "_custom_md5"), c11114.f37726).apply();
        }
        c23814.mo13141((CharSequence) c11114.f37728[c11114.f37731]);
        c11114.f37733.dismiss();
    }
}
