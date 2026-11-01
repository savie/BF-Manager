package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4826 implements InterfaceC7649 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C11986 f16971;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Set f16972;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f16973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.Configuration f16974;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f16975;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2259 f16976;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f16977;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f16978;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f16979;

    public C4826(C11986 c11986, TranslationEngine translationEngine) {
        String stringNullable;
        List list = Collections.EMPTY_LIST;
        this.f16977 = list;
        this.f16973 = list;
        this.f16971 = c11986;
        this.f16978 = translationEngine;
        this.f16976 = new C2259(translationEngine);
        PluginContext pluginContextM29831 = c11986.m29831();
        String strName = translationEngine.name();
        if (strName.length() >= 3 && strName.charAt(0) == '{' && C3184.m9601(1, strName) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
            strName = stringNullable;
        }
        this.f16979 = strName;
        TranslationEngine.Configuration configuration = translationEngine.getConfiguration();
        this.f16974 = configuration;
        this.f16972 = configuration.disableAutoHideLanguage ? Collections.EMPTY_SET : C4376.m12230();
        m13409();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13409() {
        TranslationEngine translationEngine = this.f16978;
        this.f16977 = new ArrayList();
        try {
            for (String str : translationEngine.loadSourceLanguages()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str);
                if (!this.f16972.contains(languageDisplayName)) {
                    this.f16977.add(new C9061(str, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C10659) this.f16971.m29831()).log(th);
            this.f16977.clear();
        }
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13408(int i) {
        TranslationEngine translationEngine = this.f16978;
        String str = ((C9061) this.f16977.get(i)).f30911;
        this.f16975 = str;
        this.f16973 = new ArrayList();
        try {
            for (String str2 : translationEngine.loadTargetLanguages(str)) {
                String languageDisplayName = translationEngine.getLanguageDisplayName(str2);
                if (!this.f16972.contains(languageDisplayName)) {
                    this.f16973.add(new C9061(str2, languageDisplayName));
                }
            }
        } catch (Throwable th) {
            ((C10659) this.f16971.m29831()).log(th);
            this.f16973.clear();
        }
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13405(int i, String str) {
        TranslationEngine translationEngine = this.f16978;
        try {
            Iterator it = translationEngine.loadTargetLanguages(((C9061) this.f16977.get(i)).f30911).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String languageDisplayName = translationEngine.getLanguageDisplayName((String) it.next());
                if (!this.f16972.contains(languageDisplayName)) {
                    if (languageDisplayName.equals(str)) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        } catch (Throwable th) {
            ((C10659) this.f16971.m29831()).log(th);
            return -1;
        }
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17526 mo13406(C10472 c10472, C10472 c10473) {
        return new C3393(this, c10472, c10473);
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13407() {
        String stringNullable;
        TranslationEngine translationEngine = this.f16978;
        C11986 c11986 = this.f16971;
        int i = 0;
        try {
            PluginContext pluginContextM29831 = c11986.m29831();
            String strName = translationEngine.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            this.f16979 = strName;
        } catch (Throwable th) {
            ((C10659) c11986.m29831()).log(th);
            this.f16979 = translationEngine.getClass().getSimpleName();
        }
        this.f16972 = this.f16974.disableAutoHideLanguage ? Collections.EMPTY_SET : C4376.m12230();
        m13409();
        if (this.f16977.isEmpty()) {
            return;
        }
        if (this.f16975 != null) {
            for (int i2 = 0; i2 < this.f16977.size(); i2++) {
                if (((C9061) this.f16977.get(i2)).f30911.equals(this.f16975)) {
                    i = i2;
                    break;
                }
            }
        }
        mo13408(i);
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List mo13404() {
        return this.f16977;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List mo13410() {
        return this.f16973;
    }

    @Override // l.InterfaceC7649
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo13411() {
        return this.f16974.targetLanguageMutable;
    }

    @Override // l.InterfaceC7649
    public final String getId() {
        return this.f16971.m29843() + ":" + this.f16978.getClass();
    }

    public final String toString() {
        return this.f16979;
    }
}
