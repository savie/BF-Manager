package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12085 implements InterfaceC22285 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f38903;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.Configuration f38904;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f38905;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10890 f38906;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18300 f38907;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f38908;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f38909;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f38910;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f38911;

    public C12085(C18300 c18300, TranslationEngine translationEngine) {
        String stringNullable;
        List list = Collections.EMPTY_LIST;
        this.f38905 = list;
        this.f38903 = list;
        this.f38907 = c18300;
        this.f38910 = translationEngine;
        this.f38906 = new C10890(translationEngine);
        PluginContext pluginContextM42678 = c18300.m42678();
        String strName = translationEngine.name();
        if (strName.length() >= 3 && strName.charAt(0) == '{' && C22313.m50373(1, strName) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
            strName = stringNullable;
        }
        this.f38908 = strName;
        TranslationEngine.Configuration configuration = translationEngine.getConfiguration();
        this.f38904 = configuration;
        this.f38911 = configuration.disableAutoHideLanguage ? Collections.EMPTY_SET : C13677.m33454();
        m30264();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30264() {
        TranslationEngine translationEngine = this.f38910;
        this.f38905 = new ArrayList();
        try {
            for (String str : translationEngine.loadSourceLanguages()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str);
                if (!this.f38911.contains(languageDisplayName)) {
                    this.f38905.add(new C13576(str, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C20889) this.f38907.m42678()).log(th);
            this.f38905.clear();
        }
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ */
    public final void mo10249(int i) {
        TranslationEngine translationEngine = this.f38910;
        String str = ((C13576) this.f38905.get(i)).f43123;
        this.f38909 = str;
        this.f38903 = new ArrayList();
        try {
            for (String str2 : translationEngine.loadTargetLanguages(str)) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str2);
                if (!this.f38911.contains(languageDisplayName)) {
                    this.f38903.add(new C13576(str2, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C20889) this.f38907.m42678()).log(th);
            this.f38903.clear();
        }
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ */
    public final int mo10246(int i, String str) {
        TranslationEngine translationEngine = this.f38910;
        try {
            Iterator it = translationEngine.loadTargetLanguages(((C13576) this.f38905.get(i)).f43123).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (!this.f38911.contains(languageDisplayName)) {
                    if (languageDisplayName.equals(str)) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        } catch (Throwable th) {
            ((C20889) this.f38907.m42678()).log(th);
            return -1;
        }
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5877 mo10247(C5131 c5131, C5131 c5132) {
        return new C20290(this, c5131, c5132);
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۙ */
    public final void mo10248() {
        String stringNullable;
        TranslationEngine translationEngine = this.f38910;
        C18300 c18300 = this.f38907;
        int i = 0;
        try {
            PluginContext pluginContextM42678 = c18300.m42678();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f38908 = strName;
        } catch (Throwable th) {
            ((C20889) c18300.m42678()).log(th);
            this.f38908 = translationEngine.getClass().getSimpleName();
        }
        this.f38911 = this.f38904.disableAutoHideLanguage ? Collections.EMPTY_SET : C13677.m33454();
        m30264();
        if (this.f38905.isEmpty()) {
            return;
        }
        if (this.f38909 != null) {
            for (int i2 = 0; i2 < this.f38905.size(); i2++) {
                if (((C13576) this.f38905.get(i2)).f43123.equals(this.f38909)) {
                    i = i2;
                    break;
                }
            }
        }
        mo10249(i);
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ᩸ */
    public final List mo10253() {
        return this.f38905;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ۤ */
    public final List mo10251() {
        return this.f38903;
    }

    @Override // l.InterfaceC22285
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10252() {
        return this.f38904.targetLanguageMutable;
    }

    @Override // l.InterfaceC22285
    public final String getId() {
        return this.f38907.m42672() + ":" + this.f38910.getClass();
    }

    public final String toString() {
        return this.f38908;
    }
}
