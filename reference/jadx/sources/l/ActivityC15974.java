package l;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15974 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51857 = 0;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public TextView[] f51858;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f51859;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public String f51860;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f51861;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "FontViewer";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Typeface typefaceCreateFromFile;
        super.onCreate(bundle);
        m40418(R.string.MT_Protector);
        m40418(R.layout.MT_Protector);
        int[] iArr = {R.id.text1, R.id.text2, R.id.text3, R.id.text4, R.id.MT_Protector, R.id.MT_Protector};
        this.f51858 = new TextView[6];
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.f51858;
            if (i >= textViewArr.length) {
                break;
            }
            textViewArr[i] = (TextView) m40418(iArr[i]);
            i++;
        }
        String string = ApplicationC17729.f58258.getString("font_viewer_displayed_text", "");
        this.f51860 = string;
        if (TextUtils.isEmpty(string)) {
            this.f51860 = getString(R.string.MT_Protector);
        }
        if (this.f51860.length() > 200) {
            this.f51860 = this.f51860.substring(0, 200);
        }
        for (TextView textView : this.f51858) {
            textView.setText(this.f51860);
        }
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC4425(3, this));
        if (C14584.m35199(this)) {
            return;
        }
        try {
            AbstractC22044 abstractC22044M35190 = C14584.m35190(getIntent());
            this.f56046.setSubtitle(abstractC22044M35190.getName());
            try {
                FileInputStream fileInputStream = new FileInputStream(abstractC22044M35190.mo4294());
                try {
                    typefaceCreateFromFile = Build.VERSION.SDK_INT >= 26 ? new Typeface.Builder(fileInputStream.getFD()).build() : Typeface.createFromFile(abstractC22044M35190.mo4278());
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                AbstractC22044 abstractC22044M49877 = C6382.f21563.m49877();
                this.f51859 = abstractC22044M49877;
                abstractC22044M35190.m49847(abstractC22044M49877, (C24523) null, (InterfaceC23711) null);
                abstractC22044M35190 = this.f51859;
                typefaceCreateFromFile = Typeface.createFromFile(abstractC22044M35190.mo4278());
            }
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new Exception("Invalid font file");
            }
            for (TextView textView2 : this.f51858) {
                textView2.setTypeface(typefaceCreateFromFile);
            }
            ((TextView) m40418(R.id.text)).setTypeface(typefaceCreateFromFile);
            m38091(abstractC22044M35190);
        } catch (Throwable unused2) {
            C22673.m51152(R.string.MT_Protector);
            finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38091(AbstractC22044 abstractC22044) {
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                C7630 c7630M20844 = C7630.m20844(inputStreamMo4290);
                Locale locale = getResources().getConfiguration().locale;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                m38089(spannableStringBuilder, "Full Name", c7630M20844.m20845(4, locale));
                m38089(spannableStringBuilder, "Font Family", c7630M20844.m20845(1, locale));
                m38089(spannableStringBuilder, "Font Subfamily", c7630M20844.m20845(2, locale));
                m38089(spannableStringBuilder, "Unique Subfamily Identification", c7630M20844.m20845(3, locale));
                m38089(spannableStringBuilder, e.g, c7630M20844.m20845(5, locale));
                m38089(spannableStringBuilder, "Post Script", c7630M20844.m20845(6, locale));
                m38089(spannableStringBuilder, "Trademark", c7630M20844.m20845(7, locale));
                m38089(spannableStringBuilder, "Manufacturer", c7630M20844.m20845(8, locale));
                m38089(spannableStringBuilder, "Designer", c7630M20844.m20845(9, locale));
                m38089(spannableStringBuilder, "Description", c7630M20844.m20845(10, locale));
                m38089(spannableStringBuilder, "Copyright", c7630M20844.m20845(0, locale));
                m38089(spannableStringBuilder, "License", c7630M20844.m20845(13, locale));
                this.f51861 = spannableStringBuilder;
                invalidateOptionsMenu();
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38089(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n\n");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10738), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        spannableStringBuilder.append("\n");
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length3, spannableStringBuilder.length(), 33);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        if (this.f51861 != null) {
            return true;
        }
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C17466 c17466 = new C17466(this, this);
            c17466.m22945(R.string.MT_Protector);
            c17466.m22924((CharSequence) this.f51860);
            c17466.m22942(200);
            c17466.m22961();
            c17466.m22959();
            c17466.m22955(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8008(this.f51861);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C5416.m16141(dialogInterfaceC8327M8016);
        ((TextView) dialogInterfaceC8327M8016.m22423(android.R.id.message)).setTextIsSelectable(true);
        return true;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC22044 abstractC22044 = this.f51859;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
    }
}
