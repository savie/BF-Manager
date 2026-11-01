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

/* JADX INFO: renamed from: l.᩷᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21073 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68632 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public TextView[] f68633;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public SpannableStringBuilder f68634;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public String f68635;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f68636;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "FontViewer";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Typeface typefaceCreateFromFile;
        super.onCreate(bundle);
        m31016(R.string.MT_Protector);
        m31016(R.layout.MT_Protector);
        int[] iArr = {R.id.text1, R.id.text2, R.id.text3, R.id.text4, R.id.MT_Protector, R.id.MT_Protector};
        this.f68633 = new TextView[6];
        int i = 0;
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f68633;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = (TextView) m31016(iArr[i2]);
            i2++;
        }
        String string = ApplicationC0716.f2992.getString("font_viewer_displayed_text", "");
        this.f68635 = string;
        if (TextUtils.isEmpty(string)) {
            this.f68635 = getString(R.string.MT_Protector);
        }
        if (this.f68635.length() > 200) {
            this.f68635 = this.f68635.substring(0, 200);
        }
        for (TextView textView : this.f68633) {
            textView.setText(this.f68635);
        }
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC10491(i, this));
        if (C5553.m15320((AbstractActivityC12483) this)) {
            return;
        }
        try {
            AbstractC20745 abstractC20745M15309 = C5553.m15309(getIntent());
            this.f41645.setSubtitle(abstractC20745M15309.getName());
            try {
                FileInputStream fileInputStream = new FileInputStream(abstractC20745M15309.mo33986());
                try {
                    typefaceCreateFromFile = Build.VERSION.SDK_INT >= 26 ? new Typeface.Builder(fileInputStream.getFD()).build() : Typeface.createFromFile(abstractC20745M15309.mo24643());
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
                AbstractC20745 abstractC20745M46728 = C11904.f39941.m46728();
                this.f68636 = abstractC20745M46728;
                abstractC20745M15309.m46701(abstractC20745M46728, (C5222) null, (InterfaceC8978) null);
                abstractC20745M15309 = this.f68636;
                typefaceCreateFromFile = Typeface.createFromFile(abstractC20745M15309.mo24643());
            }
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new Exception("Invalid font file");
            }
            TextView[] textViewArr2 = this.f68633;
            int length = textViewArr2.length;
            while (i < length) {
                textViewArr2[i].setTypeface(typefaceCreateFromFile);
                i++;
            }
            ((TextView) m31016(R.id.text)).setTypeface(typefaceCreateFromFile);
            m47480(abstractC20745M15309);
        } catch (Throwable unused2) {
            C15829.m37611(R.string.MT_Protector);
            finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47480(AbstractC20745 abstractC20745) {
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                C6436 c6436M17619 = C6436.m17619(inputStreamMo33970);
                Locale locale = getResources().getConfiguration().locale;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                m47479(spannableStringBuilder, "Full Name", c6436M17619.m17620(4, locale));
                m47479(spannableStringBuilder, "Font Family", c6436M17619.m17620(1, locale));
                m47479(spannableStringBuilder, "Font Subfamily", c6436M17619.m17620(2, locale));
                m47479(spannableStringBuilder, "Unique Subfamily Identification", c6436M17619.m17620(3, locale));
                m47479(spannableStringBuilder, e.g, c6436M17619.m17620(5, locale));
                m47479(spannableStringBuilder, "Post Script", c6436M17619.m17620(6, locale));
                m47479(spannableStringBuilder, "Trademark", c6436M17619.m17620(7, locale));
                m47479(spannableStringBuilder, "Manufacturer", c6436M17619.m17620(8, locale));
                m47479(spannableStringBuilder, "Designer", c6436M17619.m17620(9, locale));
                m47479(spannableStringBuilder, "Description", c6436M17619.m17620(10, locale));
                m47479(spannableStringBuilder, "Copyright", c6436M17619.m17620(0, locale));
                m47479(spannableStringBuilder, "License", c6436M17619.m17620(13, locale));
                this.f68634 = spannableStringBuilder;
                invalidateOptionsMenu();
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
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
    public static void m47479(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n\n");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65970), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        spannableStringBuilder.append("\n");
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length3, spannableStringBuilder.length(), 33);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        if (this.f68634 != null) {
            return true;
        }
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C7668 c7668 = new C7668(this, this);
            c7668.m40376(R.string.MT_Protector);
            c7668.m40346((CharSequence) this.f68635);
            c7668.m40375(200);
            c7668.m40369();
            c7668.m40355();
            c7668.m40368(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21261(this.f68634);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C23250.m51307(dialogInterfaceC19356M21269);
        ((TextView) dialogInterfaceC19356M21269.m44364(android.R.id.message)).setTextIsSelectable(true);
        return true;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC20745 abstractC20745 = this.f68636;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }
}
