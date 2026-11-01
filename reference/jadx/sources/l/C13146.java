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

/* JADX INFO: renamed from: l.۬ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes4.dex */
public class C13146 extends AbstractC10324 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static String f43755 = ApplicationC0716.f2992.getString("src_lan", null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f43756 = ApplicationC0716.f2992.getString("tar_lan", null);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11986 f43757;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2259 f43758;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f43759;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f43760;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f43761;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f43762;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public View f43764;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public View f43765;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f43766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TranslationEngine.Configuration f43768;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Spinner f43769;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f43770;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f43771;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Spinner f43772;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f43775 = new ArrayList();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f43763 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f43767 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f43773 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f43774 = true;

    public C13146(AbstractActivityC12483 abstractActivityC12483, C11986 c11986, TranslationEngine translationEngine) {
        String stringNullable;
        this.f43760 = abstractActivityC12483;
        this.f43757 = c11986;
        this.f43766 = translationEngine;
        this.f43758 = new C2259(translationEngine);
        if (c11986 != null) {
            PluginContext pluginContextM29831 = c11986.m29831();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && C3184.m9601(1, strName) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f43761 = strName;
        } else {
            this.f43761 = translationEngine.name();
        }
        this.f43768 = translationEngine.getConfiguration();
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f43764 = viewM30995;
        ((TextView) viewM30995.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f43769 = (Spinner) viewM30995.findViewById(R.id.spinner1);
        View viewM30996 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f43765 = viewM30996;
        ((TextView) viewM30996.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        this.f43772 = (Spinner) viewM30996.findViewById(R.id.spinner1);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m32516() {
        C11986 c11986 = this.f43757;
        return c11986 == null ? "bin.mt.plugin.system" : c11986.m29843();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TranslationEngine m32517() {
        return this.f43766;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m32512() {
        int iMax;
        boolean z;
        Spinner spinner;
        Iterator it;
        String str;
        String languageDisplayName;
        int iMax2 = 0;
        this.f43773 = false;
        this.f43767 = false;
        ArrayList arrayList = this.f43775;
        arrayList.clear();
        ArrayList arrayList2 = this.f43763;
        arrayList2.clear();
        Set setM12230 = this.f43768.disableAutoHideLanguage ? Collections.EMPTY_SET : C4376.m12230();
        TranslationEngine translationEngine = this.f43766;
        ArrayList arrayList3 = new ArrayList(translationEngine.loadSourceLanguages());
        this.f43762 = arrayList3;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String languageDisplayName2 = translationEngine.getLanguageDisplayName((String) it2.next());
            if (setM12230.contains(languageDisplayName2)) {
                it2.remove();
            } else {
                arrayList.add(languageDisplayName2);
            }
        }
        if (this.f43762.isEmpty()) {
            this.f43767 = true;
            this.f43762 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = f43755;
            iMax = str2 != null ? Math.max(0, arrayList.indexOf(str2)) : 0;
            this.f43769.setSelection(iMax);
            z = this.f43767;
            spinner = this.f43772;
            if (z) {
                this.f43771 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
                spinner.setSelection(0);
                return;
            }
            ArrayList arrayList4 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f43762.get(iMax)));
            this.f43771 = arrayList4;
            it = arrayList4.iterator();
            while (it.hasNext()) {
                languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (setM12230.contains(languageDisplayName)) {
                    it.remove();
                } else {
                    arrayList2.add(languageDisplayName);
                }
            }
            if (this.f43771.isEmpty()) {
                this.f43773 = true;
                this.f43771 = Collections.singletonList("-- NULL --");
                arrayList2.add("-- NULL --");
            } else {
                str = f43756;
                if (str != null) {
                    iMax2 = Math.max(0, arrayList2.indexOf(str));
                }
            }
            spinner.setSelection(iMax2);
        }
        this.f43769.setSelection(iMax);
        z = this.f43767;
        spinner = this.f43772;
        if (z) {
            this.f43771 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
            spinner.setSelection(0);
            return;
        }
        ArrayList arrayList5 = new ArrayList(translationEngine.loadTargetLanguages((String) this.f43762.get(iMax)));
        this.f43771 = arrayList5;
        it = arrayList5.iterator();
        while (it.hasNext()) {
            languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM12230.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList2.add(languageDisplayName);
            }
        }
        if (this.f43771.isEmpty()) {
            this.f43773 = true;
            this.f43771 = Collections.singletonList("-- NULL --");
            arrayList2.add("-- NULL --");
        } else {
            str = f43756;
            if (str != null) {
                iMax2 = Math.max(0, arrayList2.indexOf(str));
            }
        }
        spinner.setSelection(iMax2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32514() {
        this.f43774 = false;
        m32512();
        ArrayList arrayList = this.f43775;
        AbstractActivityC12483 abstractActivityC12483 = this.f43760;
        C0733 c0733 = new C0733(abstractActivityC12483, arrayList);
        Spinner spinner = this.f43769;
        spinner.setAdapter((SpinnerAdapter) c0733);
        C0733 c0734 = new C0733(abstractActivityC12483, this.f43763);
        Spinner spinner2 = this.f43772;
        spinner2.setAdapter((SpinnerAdapter) c0734);
        C1150 c1150 = new C1150(this);
        spinner.setOnItemSelectedListener(c1150);
        spinner2.setOnItemSelectedListener(c1150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m32513() {
        int iMax = 0;
        this.f43773 = false;
        String str = this.f43759;
        TranslationEngine translationEngine = this.f43766;
        this.f43771 = new ArrayList(translationEngine.loadTargetLanguages(str));
        Set setM12230 = this.f43768.disableAutoHideLanguage ? Collections.EMPTY_SET : C4376.m12230();
        ArrayList arrayList = this.f43763;
        arrayList.clear();
        Iterator it = this.f43771.iterator();
        while (it.hasNext()) {
            String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
            if (setM12230.contains(languageDisplayName)) {
                it.remove();
            } else {
                arrayList.add(languageDisplayName);
            }
        }
        if (this.f43771.isEmpty()) {
            this.f43773 = true;
            this.f43771 = Collections.singletonList("-- NULL --");
            arrayList.add("-- NULL --");
        } else {
            String str2 = this.f43770;
            if (str2 != null) {
                iMax = Math.max(0, this.f43771.indexOf(str2));
            }
        }
        Spinner spinner = this.f43772;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(iMax);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۚ */
    public final String mo26146() {
        return this.f43761;
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final void mo26143(C13550 c13550) {
        int iIndexOf;
        int iIndexOf2;
        c13550.addView(this.f43764);
        c13550.addView(this.f43765);
        if (this.f43774) {
            try {
                m32514();
                return;
            } catch (RuntimeException e) {
                C11986 c11986 = this.f43757;
                if (c11986 != null) {
                    c11986.m29814(e);
                    return;
                } else {
                    C21157.m47601("bin.mt.plugin.system", null, e);
                    return;
                }
            }
        }
        if (this.f43767 || this.f43773) {
            return;
        }
        String str = f43755;
        String str2 = f43756;
        if (str == null || (iIndexOf = this.f43775.indexOf(str)) == -1) {
            return;
        }
        this.f43769.setSelection(iIndexOf);
        if (this.f43768.targetLanguageMutable) {
            this.f43759 = (String) this.f43762.get(iIndexOf);
            m32513();
        }
        if (str2 == null || (iIndexOf2 = this.f43763.indexOf(str2)) == -1) {
            return;
        }
        this.f43772.setSelection(iIndexOf2);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo26148() {
        if (this.f43767 || this.f43773) {
            C15829.m37613((CharSequence) "Error!");
            return false;
        }
        int selectedItemPosition = this.f43769.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= this.f43762.size()) {
            StringBuilder sbM40153 = C17214.m40153(selectedItemPosition, "Error: srcLanguageCode index ", " size ");
            sbM40153.append(this.f43762.size());
            C15829.m37613((CharSequence) sbM40153.toString());
            return false;
        }
        this.f43759 = (String) this.f43762.get(selectedItemPosition);
        int selectedItemPosition2 = this.f43772.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.f43771.size()) {
            StringBuilder sbM40154 = C17214.m40153(selectedItemPosition2, "Error: tarLanguageCode index ", " size ");
            sbM40154.append(this.f43771.size());
            C15829.m37613((CharSequence) sbM40154.toString());
            return false;
        }
        String str = (String) this.f43771.get(selectedItemPosition2);
        this.f43770 = str;
        if (!this.f43759.equals(str)) {
            m32506();
            return true;
        }
        C15829.m37613((CharSequence) ("Error: " + f43755 + " >> " + f43756));
        return false;
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ܰ */
    public final void mo26151() {
        this.f43766.beforeStart();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۬ */
    public final void mo26149() {
        this.f43766.onStart();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo26140() {
        return !this.f43768.forceNotToSkipTranslated;
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ܰ */
    public final String mo26150(String str, String str2) {
        if (this.f43768.acceptTranslated && str2 != null) {
            str = str2;
        }
        return this.f43758.m6936(str, this.f43759, this.f43770);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo26147() {
        return this.f43758.m6938();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۖ */
    public final BatchTranslationEngine.BatchingStrategy mo26139() {
        return this.f43758.m6935();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo26145(String[] strArr, String[] strArr2) {
        if (this.f43768.acceptTranslated) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return this.f43758.m6937(strArr, this.f43759, this.f43770);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final String mo26141(String str, String str2) {
        return (!this.f43768.acceptTranslated || str2 == null) ? str : str2;
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ᩹ */
    public final void mo26152() {
        this.f43766.onFinish();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final void mo26142() {
        this.f43766.afterFinish();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26144(Exception exc) {
        try {
            return this.f43766.onError(exc);
        } catch (Throwable th) {
            C11986 c11986 = this.f43757;
            if (c11986 != null) {
                c11986.m29814(th);
                return false;
            }
            C21157.m47601("bin.mt.plugin.system", null, th);
            return false;
        }
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ֨ */
    public final void mo26138() {
        if (this.f43774) {
            return;
        }
        m32512();
        ((BaseAdapter) this.f43769.getAdapter()).notifyDataSetChanged();
        ((BaseAdapter) this.f43772.getAdapter()).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static void m32506() {
        ApplicationC0716.f2992.edit().putString("src_lan", f43755).putString("tar_lan", f43756).apply();
    }
}
