package l;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes3.dex */
public class C4608 extends AbstractC0329 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16338;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f16339;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16340;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16342;

    @Override // l.AbstractC0329
    public final /* bridge */ /* synthetic */ AbstractC0329 setDuration(long j) {
        m14412setDuration(j);
        return this;
    }

    public C4608() {
        this.f16339 = new ArrayList();
        this.f16341 = true;
        this.f16338 = false;
        this.f16340 = 0;
    }

    public C4608(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16339 = new ArrayList();
        this.f16341 = true;
        this.f16338 = false;
        this.f16340 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1821.f6175);
        m14409(C2506.m8386(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14409(int i) {
        if (i == 0) {
            this.f16341 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C13645.m33382(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f16341 = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14411(AbstractC0329 abstractC0329) {
        this.f16339.add(abstractC0329);
        abstractC0329.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            abstractC0329.setDuration(j);
        }
        if ((this.f16340 & 1) != 0) {
            abstractC0329.setInterpolator(getInterpolator());
        }
        if ((this.f16340 & 2) != 0) {
            getPropagation();
            abstractC0329.setPropagation(null);
        }
        if ((this.f16340 & 4) != 0) {
            abstractC0329.setPathMotion(getPathMotion());
        }
        if ((this.f16340 & 8) != 0) {
            abstractC0329.setEpicenterCallback(getEpicenterCallback());
        }
    }

    /* JADX INFO: renamed from: setDuration, reason: collision with other method in class */
    public final void m14412setDuration(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f16339) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).setDuration(j);
        }
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 setStartDelay(long j) {
        return (C4608) super.setStartDelay(j);
    }

    @Override // l.AbstractC0329
    public final C4608 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f16340 |= 1;
        ArrayList arrayList = this.f16339;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0329) this.f16339.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (C4608) super.setInterpolator(timeInterpolator);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 addTarget(View view) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).addTarget(view);
        }
        return (C4608) super.addTarget(view);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 addTarget(int i) {
        for (int i2 = 0; i2 < this.f16339.size(); i2++) {
            ((AbstractC0329) this.f16339.get(i2)).addTarget(i);
        }
        return (C4608) super.addTarget(i);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 addTarget(String str) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).addTarget(str);
        }
        return (C4608) super.addTarget(str);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 addTarget(Class cls) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).addTarget(cls);
        }
        return (C4608) super.addTarget(cls);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 addListener(InterfaceC12261 interfaceC12261) {
        return (C4608) super.addListener(interfaceC12261);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f16339.size(); i2++) {
            ((AbstractC0329) this.f16339.get(i2)).removeTarget(i);
        }
        return (C4608) super.removeTarget(i);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 removeTarget(View view) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).removeTarget(view);
        }
        return (C4608) super.removeTarget(view);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 removeTarget(Class cls) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).removeTarget(cls);
        }
        return (C4608) super.removeTarget(cls);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 removeTarget(String str) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).removeTarget(str);
        }
        return (C4608) super.removeTarget(str);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f16339.size(); i2++) {
            ((AbstractC0329) this.f16339.get(i2)).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f16339.size(); i++) {
            ((AbstractC0329) this.f16339.get(i)).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 removeListener(InterfaceC12261 interfaceC12261) {
        return (C4608) super.removeListener(interfaceC12261);
    }

    @Override // l.AbstractC0329
    public final void setPathMotion(AbstractC19720 abstractC19720) {
        super.setPathMotion(abstractC19720);
        this.f16340 |= 4;
        if (this.f16339 != null) {
            for (int i = 0; i < this.f16339.size(); i++) {
                ((AbstractC0329) this.f16339.get(i)).setPathMotion(abstractC19720);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14410(AbstractC0329 abstractC0329) {
        this.f16339.remove(abstractC0329);
        abstractC0329.mParent = null;
    }

    @Override // l.AbstractC0329
    public final void createAnimators(ViewGroup viewGroup, C19524 c19524, C19524 c19525, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            AbstractC0329 abstractC0329 = (AbstractC0329) this.f16339.get(i);
            if (startDelay > 0 && (this.f16341 || i == 0)) {
                long startDelay2 = abstractC0329.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC0329.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC0329.setStartDelay(startDelay);
                }
            }
            abstractC0329.createAnimators(viewGroup, c19524, c19525, arrayList, arrayList2);
        }
    }

    @Override // l.AbstractC0329
    public final void runAnimators() {
        if (!this.f16339.isEmpty()) {
            C13752 c13752 = new C13752();
            c13752.f43629 = this;
            Iterator it = this.f16339.iterator();
            while (it.hasNext()) {
                ((AbstractC0329) it.next()).addListener(c13752);
            }
            this.f16342 = this.f16339.size();
            if (!this.f16341) {
                for (int i = 1; i < this.f16339.size(); i++) {
                    ((AbstractC0329) this.f16339.get(i - 1)).addListener(new C8532((AbstractC0329) this.f16339.get(i)));
                }
                AbstractC0329 abstractC0329 = (AbstractC0329) this.f16339.get(0);
                if (abstractC0329 != null) {
                    abstractC0329.runAnimators();
                    return;
                }
                return;
            }
            Iterator it2 = this.f16339.iterator();
            while (it2.hasNext()) {
                ((AbstractC0329) it2.next()).runAnimators();
            }
            return;
        }
        start();
        end();
    }

    @Override // l.AbstractC0329
    public final boolean hasAnimators() {
        for (int i = 0; i < this.f16339.size(); i++) {
            if (((AbstractC0329) this.f16339.get(i)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC0329
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        C7041 c7041 = new C7041(this);
        for (int i = 0; i < this.f16339.size(); i++) {
            AbstractC0329 abstractC0329 = (AbstractC0329) this.f16339.get(i);
            abstractC0329.addListener(c7041);
            abstractC0329.prepareAnimatorsForSeeking();
            long totalDurationMillis = abstractC0329.getTotalDurationMillis();
            if (this.f16341) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                abstractC0329.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC0329
    public final void setCurrentPlayTimeMillis(long j, long j2) {
        boolean z;
        int i;
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j < j2;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i2 >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(InterfaceC18228.f59511, z2);
        }
        if (this.f16341) {
            for (int i3 = 0; i3 < this.f16339.size(); i3++) {
                ((AbstractC0329) this.f16339.get(i3)).setCurrentPlayTimeMillis(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f16339.size()) {
                    size = this.f16339.size();
                    break;
                } else if (((AbstractC0329) this.f16339.get(size)).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i4 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i4 < this.f16339.size()) {
                        AbstractC0329 abstractC0329 = (AbstractC0329) this.f16339.get(i4);
                        long j3 = abstractC0329.mSeekOffsetInParent;
                        z = z2;
                        i = i2;
                        long j4 = j - j3;
                        if (j4 < 0) {
                            break;
                        }
                        abstractC0329.setCurrentPlayTimeMillis(j4, j2 - j3);
                        i4++;
                        z2 = z;
                        i2 = i;
                    }
                }
            } else {
                z = z2;
                i = i2;
                while (i4 >= 0) {
                    AbstractC0329 abstractC03210 = (AbstractC0329) this.f16339.get(i4);
                    long j5 = abstractC03210.mSeekOffsetInParent;
                    long j6 = j - j5;
                    abstractC03210.setCurrentPlayTimeMillis(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            if (this.mParent != null) {
                if ((j > totalDurationMillis || j2 > totalDurationMillis) && (i >= 0 || j2 < 0)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(InterfaceC18228.f59512, z);
            }
        }
        z = z2;
        i = i2;
        if (this.mParent != null) {
            if (j > totalDurationMillis) {
                return;
            } else {
                return;
            }
            if (j > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(InterfaceC18228.f59512, z);
        }
    }

    @Override // l.AbstractC0329
    public final boolean isSeekingSupported() {
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0329) this.f16339.get(i)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC0329
    public final void captureStartValues(C22508 c22508) {
        if (isValidTarget(c22508.f72817)) {
            for (AbstractC0329 abstractC0329 : this.f16339) {
                if (abstractC0329.isValidTarget(c22508.f72817)) {
                    abstractC0329.captureStartValues(c22508);
                    c22508.f72816.add(abstractC0329);
                }
            }
        }
    }

    @Override // l.AbstractC0329
    public final void captureEndValues(C22508 c22508) {
        if (isValidTarget(c22508.f72817)) {
            for (AbstractC0329 abstractC0329 : this.f16339) {
                if (abstractC0329.isValidTarget(c22508.f72817)) {
                    abstractC0329.captureEndValues(c22508);
                    c22508.f72816.add(abstractC0329);
                }
            }
        }
    }

    @Override // l.AbstractC0329
    public final void capturePropagationValues(C22508 c22508) {
        super.capturePropagationValues(c22508);
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).capturePropagationValues(c22508);
        }
    }

    @Override // l.AbstractC0329
    public final void pause(View view) {
        super.pause(view);
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).pause(view);
        }
    }

    @Override // l.AbstractC0329
    public final void resume(View view) {
        super.resume(view);
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).resume(view);
        }
    }

    @Override // l.AbstractC0329
    public final void cancel() {
        super.cancel();
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).cancel();
        }
    }

    @Override // l.AbstractC0329
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).forceToEnd(viewGroup);
        }
    }

    @Override // l.AbstractC0329
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).setCanRemoveViews(z);
        }
    }

    @Override // l.AbstractC0329
    public final void setPropagation(AbstractC9277 abstractC9277) {
        super.setPropagation(null);
        this.f16340 |= 2;
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).setPropagation(null);
        }
    }

    @Override // l.AbstractC0329
    public final void setEpicenterCallback(AbstractC23450 abstractC23450) {
        super.setEpicenterCallback(abstractC23450);
        this.f16340 |= 8;
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0329) this.f16339.get(i)).setEpicenterCallback(abstractC23450);
        }
    }

    @Override // l.AbstractC0329
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f16339.size(); i++) {
            StringBuilder sbM10405 = C3188.m10405(string, "\n");
            sbM10405.append(((AbstractC0329) this.f16339.get(i)).toString(C14483.m34972(str, EnumC7687.f25319)));
            string = sbM10405.toString();
        }
        return string;
    }

    @Override // l.AbstractC0329
    public final AbstractC0329 clone() {
        C4608 c4608 = (C4608) super.clone();
        c4608.f16339 = new ArrayList();
        int size = this.f16339.size();
        for (int i = 0; i < size; i++) {
            AbstractC0329 abstractC0329Clone = ((AbstractC0329) this.f16339.get(i)).clone();
            c4608.f16339.add(abstractC0329Clone);
            abstractC0329Clone.mParent = c4608;
        }
        return c4608;
    }
}
