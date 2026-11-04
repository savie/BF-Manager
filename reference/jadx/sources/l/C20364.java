package l;

import bin.mt.plugin.api.translation.BaseBatchTranslationEngine;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;

/* JADX INFO: renamed from: l.᩵ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W7H2 */
/* JADX INFO: loaded from: classes5.dex */
public class C20364 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f65313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f65314;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65315;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseBatchTranslationEngine f65316;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f65317;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65318;

    public C20364(BaseBatchTranslationEngine baseBatchTranslationEngine, int i, int i2) {
        this.f65316 = baseBatchTranslationEngine;
        this.f65314 = i;
        this.f65318 = i2;
        this.f65313 = baseBatchTranslationEngine.getConfiguration().textLengthCalculator;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public void reset() {
        this.f65317 = 0;
        this.f65315 = 0;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public boolean tryAdd(String str) {
        int i = this.f65314;
        if (i > 0 && this.f65317 >= i) {
            return false;
        }
        TranslationEngine.TextLengthCalculator textLengthCalculator = this.f65313;
        int length = textLengthCalculator == null ? str.length() : textLengthCalculator.calculate(str);
        int i2 = this.f65318;
        if (i2 > 0 && this.f65315 + length > i2) {
            return false;
        }
        this.f65317++;
        this.f65315 += length;
        return true;
    }
}
