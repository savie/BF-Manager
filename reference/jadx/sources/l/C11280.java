package l;

import bin.mt.plugin.api.translation.BaseBatchTranslationEngine;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;

/* JADX INFO: renamed from: l.ۧ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7H2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11280 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f38103;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f38104;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseBatchTranslationEngine f38105;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f38106;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38108;

    public C11280(BaseBatchTranslationEngine baseBatchTranslationEngine, int i, int i2) {
        this.f38105 = baseBatchTranslationEngine;
        this.f38106 = i;
        this.f38103 = i2;
        this.f38104 = baseBatchTranslationEngine.getConfiguration().textLengthCalculator;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public void reset() {
        this.f38107 = 0;
        this.f38108 = 0;
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public boolean tryAdd(String str) {
        int i = this.f38106;
        if (i > 0 && this.f38107 >= i) {
            return false;
        }
        TranslationEngine.TextLengthCalculator textLengthCalculator = this.f38104;
        int length = textLengthCalculator == null ? str.length() : textLengthCalculator.calculate(str);
        int i2 = this.f38103;
        if (i2 > 0 && this.f38108 + length > i2) {
            return false;
        }
        this.f38107++;
        this.f38108 += length;
        return true;
    }
}
