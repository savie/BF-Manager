package l;

import android.os.SystemClock;
import bin.mt.plugin.api.translation.BaseTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.o.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes.dex */
public final class C22332 extends BaseTranslationEngine {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f72302;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f72303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f72304;

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final String name() {
        return "Youdao Translator";
    }

    public C22332() {
        List listAsList = Arrays.asList("zh", "en", "ja", "fr", "de", "ru", "es", "pt", "it", "vi", "id", "ar", "nl", "th");
        this.f72302 = listAsList;
        this.f72304 = listAsList.subList(1, listAsList.size());
        this.f72303 = Collections.singletonList("zh");
        init(new C17905());
    }

    @Override // bin.mt.plugin.api.translation.BaseTranslationEngine
    public final void onBuildConfiguration(TranslationEngine.ConfigurationBuilder configurationBuilder) {
        super.onBuildConfiguration(configurationBuilder);
        configurationBuilder.setAllowBatchTranslationBySeparator(true);
        configurationBuilder.setMaxTranslationTextLength(b.j0);
        configurationBuilder.setTargetLanguageMutable(true);
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final List loadSourceLanguages() {
        return this.f72302;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final List loadTargetLanguages(String str) {
        if (str.equals("zh")) {
            return this.f72304;
        }
        return this.f72303;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine, bin.mt.plugin.api.translation.BatchTranslationEngine
    public final String translate(String str, String str2, String str3) {
        SystemClock.sleep(300L);
        return C5178.m15607(str, C11143.m28098(str, str2, str3));
    }
}
