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

/* JADX INFO: renamed from: l.ᩳᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes5.dex */
public class C19272 extends AbstractC11813 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f62316;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C20956 f62317;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C8085 f62318;

    public C19272(Context context) {
        super(context);
        this.f62318 = new C8085();
        m44606((AttributeSet) null);
    }

    public C19272(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62318 = new C8085();
        m44606(attributeSet);
    }

    public C19272(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62318 = new C8085();
        m44606(attributeSet);
    }

    public C19272(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f62318 = new C8085();
        m44606(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44610(C19272 c19272, AbstractActivityC17204 abstractActivityC17204, String str) {
        if (c19272.f62318.f26743 == null) {
            return;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        ApplicationC17729.f58258.edit().putString("ffpp", abstractC22044M35193.getParent()).apply();
        new C0627(c19272, abstractActivityC17204, abstractC22044M35193, str).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44606(AttributeSet attributeSet) {
        int resourceId = R.array.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = m12560().obtainStyledAttributes(attributeSet, C3676.f12644);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.array.MT_Protector);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f62316 = resourceId;
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(m12560());
        C17359.requireNonNull(abstractActivityC17204);
        this.f62317 = ViewOnClickListenerC11499.m28899(abstractActivityC17204, new C21510(this, abstractActivityC17204));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44605(SharedPreferences sharedPreferences, String str) {
        int i;
        String[] stringArray = m12560().getResources().getStringArray(this.f62316);
        if (stringArray.length == 0) {
            stringArray = new String[]{C21576.m49088(R.string.MT_Protector)};
        }
        String[] strArr = (String[]) Arrays.copyOf(stringArray, stringArray.length + 1);
        C8085 c8085 = this.f62318;
        c8085.f26739 = strArr;
        c8085.f26741 = stringArray.length;
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
        c8085.f26740 = i;
        c8085.f26744 = sharedPreferences.getString(str + "_custom", null);
        c8085.f26746 = sharedPreferences.getString(str + "_custom_md5", null);
        AbstractC22044 abstractC22044 = C6382.f21568;
        c8085.f26745 = abstractC22044.m49876(str + "_custom.dat");
        c8085.f26738 = abstractC22044.m49876(str + "_custom.dat.tmp");
        c8085.f26742 = false;
        if (c8085.f26744 != null && (c8085.f26746 == null || !c8085.f26745.mo2934())) {
            c8085.f26744 = null;
            c8085.f26746 = null;
        }
        if (c8085.f26744 == null && c8085.f26745.mo2934()) {
            c8085.f26745.mo4287();
        }
        int i2 = c8085.f26740;
        if (i2 < 0 || i2 > c8085.f26741) {
            c8085.f26740 = 0;
        }
        String strM49088 = c8085.f26744;
        if (strM49088 == null && c8085.f26740 == c8085.f26741) {
            c8085.f26740 = 0;
        }
        String[] strArr2 = c8085.f26739;
        int i3 = c8085.f26741;
        if (strM49088 == null) {
            strM49088 = C21576.m49088(R.string.MT_Protector);
        }
        strArr2[i3] = C21576.m49059(R.string.MT_Protector, strM49088);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۢ */
    public final void mo12582() {
        super.mo12582();
        m44605(m29658(), m12557());
        C8085 c8085 = this.f62318;
        mo12567((CharSequence) c8085.f26739[c8085.f26740]);
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(final AbstractActivityC17204 abstractActivityC17204) {
        final SharedPreferences sharedPreferencesM29658 = m29658();
        final String strM12557 = m12557();
        m44605(sharedPreferencesM29658, strM12557);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8024(m12578());
        C8085 c8085 = this.f62318;
        c2361BuildDialog.m8013(c8085.f26739, c8085.f26740, new DialogInterfaceOnClickListenerC13348(3, this));
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5891(4, this));
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.᩺ᩴۧ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C19272.m44607(this.f79468);
            }
        });
        c8085.f26743 = c2361BuildDialog.m8016();
        c8085.m21975();
        c8085.f26743.m22440().setOnClickListener(new ViewOnClickListenerC4356(0, this));
        c8085.f26743.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܰᩴۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19272.m44609(this.f48409, abstractActivityC17204, sharedPreferencesM29658, strM12557);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44608(C19272 c19272, int i) {
        C8085 c8085 = c19272.f62318;
        c8085.f26740 = i;
        c8085.m21975();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44612(C19272 c19272) {
        C8085 c8085 = c19272.f62318;
        if (c8085.f26742) {
            c8085.f26738.mo4287();
            c8085.f26742 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44607(C19272 c19272) {
        C8085 c8085 = c19272.f62318;
        if (c8085.f26742) {
            c8085.f26738.mo4287();
            c8085.f26742 = false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m44611(C19272 c19272) {
        String string = ApplicationC17729.f58258.getString("ffpp", null);
        if (TextUtils.isEmpty(string)) {
            string = C6382.f21566.mo4294();
        }
        C20956 c20956 = c19272.f62317;
        c20956.getClass();
        C20956.m47909(c20956, R.string.MT_Protector, string, new String[]{"ttf", "ttc", "otf", "woff"}, 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44609(C19272 c19272, AbstractActivityC17204 abstractActivityC17204, SharedPreferences sharedPreferences, String str) {
        C8085 c8085 = c19272.f62318;
        if (c8085.f26740 != c8085.f26741) {
            if (c8085.f26742) {
                c8085.f26738.mo4287();
                c8085.f26742 = false;
            }
            sharedPreferences.edit().putInt(str, c8085.f26740).apply();
        } else {
            if (c8085.f26744 == null) {
                c8085.f26743.m22436().setEnabled(false);
                return;
            }
            if (c8085.f26742) {
                try {
                    c8085.f26738.m49845(c8085.f26745, (Runnable) null);
                } catch (IOException e) {
                    abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            sharedPreferences.edit().putInt(str, c8085.f26740).putString(C14483.m34972(str, "_custom"), c8085.f26744).putString(C14483.m34972(str, "_custom_md5"), c8085.f26746).apply();
        }
        c19272.mo12567((CharSequence) c8085.f26739[c8085.f26740]);
        c8085.f26743.dismiss();
    }
}
