package l;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۫᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes4.dex */
public class C13381 extends AbstractC12635 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f42647;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f42649;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f42651;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f42652;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f42653;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f42654;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18300 f42655;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f42657;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Spinner f42658;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f42660;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Spinner f42661;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TranslationEngine.Configuration f42662;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10890 f42663;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f42664;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String f42646 = ApplicationC17729.f58258.getString("src_lan", null);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String f42645 = ApplicationC17729.f58258.getString("tar_lan", null);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f42665 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42648 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f42650 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42659 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42656 = true;

    public C13381(AbstractActivityC17204 abstractActivityC17204, C18300 c18300, TranslationEngine translationEngine) {
        String stringNullable;
        this.f42649 = abstractActivityC17204;
        this.f42655 = c18300;
        this.f42652 = translationEngine;
        this.f42663 = new C10890(translationEngine);
        if (c18300 != null) {
            PluginContext pluginContextM42678 = c18300.m42678();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && C22313.m50373(1, strName) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f42660 = strName;
        } else {
            this.f42660 = translationEngine.name();
        }
        this.f42662 = translationEngine.getConfiguration();
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f42654 = viewM40395;
        ((TextView) viewM40395.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f42658 = (Spinner) viewM40395.findViewById(R.id.spinner1);
        View viewM40396 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f42651 = viewM40396;
        ((TextView) viewM40396.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f42661 = (Spinner) viewM40396.findViewById(R.id.spinner1);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m33005() {
        C18300 c18300 = this.f42655;
        return c18300 == null ? "bin.mt.plugin.system" : c18300.m42672();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TranslationEngine m33006() {
        return this.f42652;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m32997() {
        int iMax;
        boolean z;
        Spinner spinner;
        Iterator it;
        String str;
        String languageDisplayName;
        int iMax2 = 0;
        this.f42659 = false;
        this.f42650 = false;
        ArrayList arrayList = this.f42665;
        arrayList.clear();
        ArrayList arrayList2 = this.f42648;
        arrayList2.clear();
        Set setM33454 = this.f42662.disableAutoHideLanguage ? Collections.EMPTY_SET : C13677.m33454();
        TranslationEngine translationEngine = this.f42652;
        ArrayList arrayList3 = new ArrayList(translationEngine.loadSourceLanguages());
        this.f42653 = arrayList3;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String languageDisplayName2 = translationEngine.getLanguageDisplayName((String) it2.next());
            if (setM33454.contains(languageDisplayName2)) {
                it2.remove();
            } else {
                arrayList.add(languageDisplayName2);
            }
        }
        if (this.f42653.isEmpty()) {
            this.f42650 = true;
            this.f42653 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = f42646;
            iMax = str2 != null ? Math.max(0, arrayList.indexOf(str2)) : 0;
            this.f42658.setSelection(iMax);
            z = this.f42650;
            spinner = this.f42661;
            if (z) {
                this.f42664 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
                spinner.setSelection(0);
                return;
            }
            ArrayList arrayList4 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f42653.get(iMax)));
            this.f42664 = arrayList4;
            it = arrayList4.iterator();
            while (it.hasNext()) {
                languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (setM33454.contains(languageDisplayName)) {
                    it.remove();
                } else {
                    arrayList2.add(languageDisplayName);
                }
            }
            if (this.f42664.isEmpty()) {
                this.f42659 = true;
                this.f42664 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
            } else {
                str = f42645;
                if (str != null) {
                    iMax2 = Math.max(0, arrayList2.indexOf(str));
                }
            }
            spinner.setSelection(iMax2);
        }
        this.f42658.setSelection(iMax);
        z = this.f42650;
        spinner = this.f42661;
        if (z) {
            this.f42664 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
            spinner.setSelection(0);
            return;
        }
        ArrayList arrayList5 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f42653.get(iMax)));
        this.f42664 = arrayList5;
        it = arrayList5.iterator();
        while (it.hasNext()) {
            languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM33454.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList2.add(languageDisplayName);
            }
        }
        if (this.f42664.isEmpty()) {
            this.f42659 = true;
            this.f42664 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
        } else {
            str = f42645;
            if (str != null) {
                iMax2 = Math.max(0, arrayList2.indexOf(str));
            }
        }
        spinner.setSelection(iMax2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m32998() {
        this.f42656 = false;
        m32997();
        ArrayList arrayList = this.f42665;
        AbstractActivityC17204 abstractActivityC17204 = this.f42649;
        C3054 c3054 = new C3054(abstractActivityC17204, arrayList);
        Spinner spinner = this.f42658;
        spinner.setAdapter((SpinnerAdapter) c3054);
        C3054 c3055 = new C3054(abstractActivityC17204, this.f42648);
        Spinner spinner2 = this.f42661;
        spinner2.setAdapter((SpinnerAdapter) c3055);
        C15618 c15618 = new C15618(this);
        spinner.setOnItemSelectedListener(c15618);
        spinner2.setOnItemSelectedListener(c15618);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m33004() {
        int iMax = 0;
        this.f42659 = false;
        String str = this.f42647;
        TranslationEngine translationEngine = this.f42652;
        this.f42664 = new ArrayList(translationEngine.loadTargetLanguages(str));
        Set setM33454 = this.f42662.disableAutoHideLanguage ? Collections.EMPTY_SET : C13677.m33454();
        ArrayList arrayList = this.f42648;
        arrayList.clear();
        Iterator it = this.f42664.iterator();
        while (it.hasNext()) {
            String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM33454.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList.add(languageDisplayName);
            }
        }
        if (this.f42664.isEmpty()) {
            this.f42659 = true;
            this.f42664 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = this.f42657;
            if (str2 != null) {
                iMax = Math.max(0, this.f42664.indexOf(str2));
            }
        }
        Spinner spinner = this.f42661;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(iMax);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩴ */
    public final String mo31412() {
        return this.f42660;
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final void mo31404(C4925 c4925) {
        int iIndexOf;
        int iIndexOf2;
        c4925.addView(this.f42654);
        c4925.addView(this.f42651);
        if (this.f42656) {
            try {
                m32998();
                return;
            } catch (RuntimeException e) {
                C18300 c18300 = this.f42655;
                if (c18300 != null) {
                    c18300.m42654(e);
                    return;
                } else {
                    C5448.m16280("bin.mt.plugin.system", null, e);
                    return;
                }
            }
        }
        if (this.f42650 || this.f42659) {
            return;
        }
        String str = f42646;
        String str2 = f42645;
        if (str == null || (iIndexOf = this.f42665.indexOf(str)) == -1) {
            return;
        }
        this.f42658.setSelection(iIndexOf);
        if (this.f42662.targetLanguageMutable) {
            this.f42647 = (String) this.f42653.get(iIndexOf);
            m33004();
        }
        if (str2 == null || (iIndexOf2 = this.f42648.indexOf(str2)) == -1) {
            return;
        }
        this.f42661.setSelection(iIndexOf2);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo31408() {
        if (this.f42650 || this.f42659) {
            C22673.m51154((CharSequence) "Error!");
            return false;
        }
        int selectedItemPosition = this.f42658.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= this.f42653.size()) {
            StringBuilder sbM12235 = C3769.m12235(selectedItemPosition, "Error: srcLanguageCode index ", " size ");
            sbM12235.append(this.f42653.size());
            C22673.m51154((CharSequence) sbM12235.toString());
            return false;
        }
        this.f42647 = (String) this.f42653.get(selectedItemPosition);
        int selectedItemPosition2 = this.f42661.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.f42664.size()) {
            StringBuilder sbM12236 = C3769.m12235(selectedItemPosition2, "Error: tarLanguageCode index ", " size ");
            sbM12236.append(this.f42664.size());
            C22673.m51154((CharSequence) sbM12236.toString());
            return false;
        }
        String str = (String) this.f42664.get(selectedItemPosition2);
        this.f42657 = str;
        if (!this.f42647.equals(str)) {
            m32988();
            return true;
        }
        C22673.m51154((CharSequence) ("Error: " + f42646 + " >> " + f42645));
        return false;
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩷ */
    public final void mo31414() {
        this.f42652.beforeStart();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۚ */
    public final void mo31407() {
        this.f42652.onStart();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31401() {
        return !this.f42662.forceNotToSkipTranslated;
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩷ */
    public final String mo31413(String str, String str2) {
        if (this.f42662.acceptTranslated && str2 != null) {
            str = str2;
        }
        return this.f42663.m27638(str, this.f42647, this.f42657);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo31409() {
        return this.f42663.m27640();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩸ */
    public final BatchTranslationEngine.BatchingStrategy mo31415() {
        return this.f42663.m27637();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo31406(String[] strArr, String[] strArr2) {
        if (this.f42662.acceptTranslated) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return this.f42663.m27639(strArr, this.f42647, this.f42657);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final String mo31402(String str, String str2) {
        return (!this.f42662.acceptTranslated || str2 == null) ? str : str2;
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ܳ */
    public final void mo31411() {
        this.f42652.onFinish();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final void mo31403() {
        this.f42652.afterFinish();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo31405(Exception exc) {
        try {
            return this.f42652.onError(exc);
        } catch (Throwable th) {
            C18300 c18300 = this.f42655;
            if (c18300 != null) {
                c18300.m42654(th);
                return false;
            }
            C5448.m16280("bin.mt.plugin.system", null, th);
            return false;
        }
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۫ */
    public final void mo31410() {
        if (this.f42656) {
            return;
        }
        m32997();
        ((BaseAdapter) this.f42658.getAdapter()).notifyDataSetChanged();
        ((BaseAdapter) this.f42661.getAdapter()).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m32988() {
        ApplicationC17729.f58258.edit().putString("src_lan", f42646).putString("tar_lan", f42645).apply();
    }
}
