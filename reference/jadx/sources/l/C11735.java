package l;

import android.os.SystemClock;
import bin.mt.plugin.api.translation.BaseTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.o.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11735 extends BaseTranslationEngine {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f39450;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f39451;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f39452;

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final String name() {
        return "Youdao Translator";
    }

    public C11735() {
        List listAsList = Arrays.asList("zh", "en", "ja", "fr", "de", "ru", "es", "pt", "it", "vi", "id", "ar", "nl", "th");
        this.f39450 = listAsList;
        this.f39452 = listAsList.subList(1, listAsList.size());
        this.f39451 = Collections.singletonList("zh");
        init(new C16303());
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
        return this.f39450;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine
    public final List loadTargetLanguages(String str) {
        if (str.equals("zh")) {
            return this.f39452;
        }
        return this.f39451;
    }

    @Override // bin.mt.plugin.api.translation.TranslationEngine, bin.mt.plugin.api.translation.BatchTranslationEngine
    public final String translate(String str, String str2, String str3) {
        SystemClock.sleep(300L);
        return C2641.m8150(str, C2561.m7999(str, str2, str3));
    }
}
