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

/* JADX INFO: renamed from: l.᩸ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes5.dex */
public class C21643 extends AbstractC11766 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f70173;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f70174;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70175;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f70176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70177;

    @Override // l.AbstractC11766
    public final /* bridge */ /* synthetic */ AbstractC11766 setDuration(long j) {
        m48355setDuration(j);
        return this;
    }

    public C21643() {
        this.f70174 = new ArrayList();
        this.f70173 = true;
        this.f70176 = false;
        this.f70175 = 0;
    }

    public C21643(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70174 = new ArrayList();
        this.f70173 = true;
        this.f70176 = false;
        this.f70175 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69015);
        m48352(C12398.m30833(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48352(int i) {
        if (i == 0) {
            this.f70173 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C8479.m22141(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f70173 = false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48354(AbstractC11766 abstractC11766) {
        this.f70174.add(abstractC11766);
        abstractC11766.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            abstractC11766.setDuration(j);
        }
        if ((this.f70175 & 1) != 0) {
            abstractC11766.setInterpolator(getInterpolator());
        }
        if ((this.f70175 & 2) != 0) {
            getPropagation();
            abstractC11766.setPropagation(null);
        }
        if ((this.f70175 & 4) != 0) {
            abstractC11766.setPathMotion(getPathMotion());
        }
        if ((this.f70175 & 8) != 0) {
            abstractC11766.setEpicenterCallback(getEpicenterCallback());
        }
    }

    /* JADX INFO: renamed from: setDuration, reason: collision with other method in class */
    public final void m48355setDuration(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f70174) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).setDuration(j);
        }
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 setStartDelay(long j) {
        return (C21643) super.setStartDelay(j);
    }

    @Override // l.AbstractC11766
    public final C21643 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f70175 |= 1;
        ArrayList arrayList = this.f70174;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC11766) this.f70174.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (C21643) super.setInterpolator(timeInterpolator);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 addTarget(View view) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).addTarget(view);
        }
        return (C21643) super.addTarget(view);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 addTarget(int i) {
        for (int i2 = 0; i2 < this.f70174.size(); i2++) {
            ((AbstractC11766) this.f70174.get(i2)).addTarget(i);
        }
        return (C21643) super.addTarget(i);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 addTarget(String str) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).addTarget(str);
        }
        return (C21643) super.addTarget(str);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 addTarget(Class cls) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).addTarget(cls);
        }
        return (C21643) super.addTarget(cls);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 addListener(InterfaceC24031 interfaceC24031) {
        return (C21643) super.addListener(interfaceC24031);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f70174.size(); i2++) {
            ((AbstractC11766) this.f70174.get(i2)).removeTarget(i);
        }
        return (C21643) super.removeTarget(i);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 removeTarget(View view) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).removeTarget(view);
        }
        return (C21643) super.removeTarget(view);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 removeTarget(Class cls) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).removeTarget(cls);
        }
        return (C21643) super.removeTarget(cls);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 removeTarget(String str) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).removeTarget(str);
        }
        return (C21643) super.removeTarget(str);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f70174.size(); i2++) {
            ((AbstractC11766) this.f70174.get(i2)).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f70174.size(); i++) {
            ((AbstractC11766) this.f70174.get(i)).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 removeListener(InterfaceC24031 interfaceC24031) {
        return (C21643) super.removeListener(interfaceC24031);
    }

    @Override // l.AbstractC11766
    public final void setPathMotion(AbstractC19798 abstractC19798) {
        super.setPathMotion(abstractC19798);
        this.f70175 |= 4;
        if (this.f70174 != null) {
            for (int i = 0; i < this.f70174.size(); i++) {
                ((AbstractC11766) this.f70174.get(i)).setPathMotion(abstractC19798);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48353(AbstractC11766 abstractC11766) {
        this.f70174.remove(abstractC11766);
        abstractC11766.mParent = null;
    }

    @Override // l.AbstractC11766
    public final void createAnimators(ViewGroup viewGroup, C19527 c19527, C19527 c19528, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            AbstractC11766 abstractC11766 = (AbstractC11766) this.f70174.get(i);
            if (startDelay > 0 && (this.f70173 || i == 0)) {
                long startDelay2 = abstractC11766.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC11766.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC11766.setStartDelay(startDelay);
                }
            }
            abstractC11766.createAnimators(viewGroup, c19527, c19528, arrayList, arrayList2);
        }
    }

    @Override // l.AbstractC11766
    public final void runAnimators() {
        if (!this.f70174.isEmpty()) {
            C15294 c15294 = new C15294();
            c15294.f49834 = this;
            Iterator it = this.f70174.iterator();
            while (it.hasNext()) {
                ((AbstractC11766) it.next()).addListener(c15294);
            }
            this.f70177 = this.f70174.size();
            if (!this.f70173) {
                for (int i = 1; i < this.f70174.size(); i++) {
                    ((AbstractC11766) this.f70174.get(i - 1)).addListener(new C6826((AbstractC11766) this.f70174.get(i)));
                }
                AbstractC11766 abstractC11766 = (AbstractC11766) this.f70174.get(0);
                if (abstractC11766 != null) {
                    abstractC11766.runAnimators();
                    return;
                }
                return;
            }
            Iterator it2 = this.f70174.iterator();
            while (it2.hasNext()) {
                ((AbstractC11766) it2.next()).runAnimators();
            }
            return;
        }
        start();
        end();
    }

    @Override // l.AbstractC11766
    public final boolean hasAnimators() {
        for (int i = 0; i < this.f70174.size(); i++) {
            if (((AbstractC11766) this.f70174.get(i)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC11766
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        C23055 c23055 = new C23055(this);
        for (int i = 0; i < this.f70174.size(); i++) {
            AbstractC11766 abstractC11766 = (AbstractC11766) this.f70174.get(i);
            abstractC11766.addListener(c23055);
            abstractC11766.prepareAnimatorsForSeeking();
            long totalDurationMillis = abstractC11766.getTotalDurationMillis();
            if (this.f70173) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                abstractC11766.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC11766
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
            notifyListeners(InterfaceC13883.f45755, z2);
        }
        if (this.f70173) {
            for (int i3 = 0; i3 < this.f70174.size(); i3++) {
                ((AbstractC11766) this.f70174.get(i3)).setCurrentPlayTimeMillis(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f70174.size()) {
                    size = this.f70174.size();
                    break;
                } else if (((AbstractC11766) this.f70174.get(size)).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i4 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i4 < this.f70174.size()) {
                        AbstractC11766 abstractC11766 = (AbstractC11766) this.f70174.get(i4);
                        long j3 = abstractC11766.mSeekOffsetInParent;
                        z = z2;
                        i = i2;
                        long j4 = j - j3;
                        if (j4 < 0) {
                            break;
                        }
                        abstractC11766.setCurrentPlayTimeMillis(j4, j2 - j3);
                        i4++;
                        z2 = z;
                        i2 = i;
                    }
                }
            } else {
                z = z2;
                i = i2;
                while (i4 >= 0) {
                    AbstractC11766 abstractC11767 = (AbstractC11766) this.f70174.get(i4);
                    long j5 = abstractC11767.mSeekOffsetInParent;
                    long j6 = j - j5;
                    abstractC11767.setCurrentPlayTimeMillis(j6, j2 - j5);
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
                notifyListeners(InterfaceC13883.f45757, z);
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
            notifyListeners(InterfaceC13883.f45757, z);
        }
    }

    @Override // l.AbstractC11766
    public final boolean isSeekingSupported() {
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC11766) this.f70174.get(i)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC11766
    public final void captureStartValues(C8238 c8238) {
        if (isValidTarget(c8238.f28685)) {
            for (AbstractC11766 abstractC11766 : this.f70174) {
                if (abstractC11766.isValidTarget(c8238.f28685)) {
                    abstractC11766.captureStartValues(c8238);
                    c8238.f28684.add(abstractC11766);
                }
            }
        }
    }

    @Override // l.AbstractC11766
    public final void captureEndValues(C8238 c8238) {
        if (isValidTarget(c8238.f28685)) {
            for (AbstractC11766 abstractC11766 : this.f70174) {
                if (abstractC11766.isValidTarget(c8238.f28685)) {
                    abstractC11766.captureEndValues(c8238);
                    c8238.f28684.add(abstractC11766);
                }
            }
        }
    }

    @Override // l.AbstractC11766
    public final void capturePropagationValues(C8238 c8238) {
        super.capturePropagationValues(c8238);
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).capturePropagationValues(c8238);
        }
    }

    @Override // l.AbstractC11766
    public final void pause(View view) {
        super.pause(view);
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).pause(view);
        }
    }

    @Override // l.AbstractC11766
    public final void resume(View view) {
        super.resume(view);
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).resume(view);
        }
    }

    @Override // l.AbstractC11766
    public final void cancel() {
        super.cancel();
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).cancel();
        }
    }

    @Override // l.AbstractC11766
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).forceToEnd(viewGroup);
        }
    }

    @Override // l.AbstractC11766
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).setCanRemoveViews(z);
        }
    }

    @Override // l.AbstractC11766
    public final void setPropagation(AbstractC13177 abstractC13177) {
        super.setPropagation(null);
        this.f70175 |= 2;
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).setPropagation(null);
        }
    }

    @Override // l.AbstractC11766
    public final void setEpicenterCallback(AbstractC17680 abstractC17680) {
        super.setEpicenterCallback(abstractC17680);
        this.f70175 |= 8;
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11766) this.f70174.get(i)).setEpicenterCallback(abstractC17680);
        }
    }

    @Override // l.AbstractC11766
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f70174.size(); i++) {
            StringBuilder sbM8976 = C3012.m8976(string, "\n");
            sbM8976.append(((AbstractC11766) this.f70174.get(i)).toString(C15489.m37076(str, EnumC19730.f63352)));
            string = sbM8976.toString();
        }
        return string;
    }

    @Override // l.AbstractC11766
    public final AbstractC11766 clone() {
        C21643 c21643 = (C21643) super.clone();
        c21643.f70174 = new ArrayList();
        int size = this.f70174.size();
        for (int i = 0; i < size; i++) {
            AbstractC11766 abstractC11766Clone = ((AbstractC11766) this.f70174.get(i)).clone();
            c21643.f70174.add(abstractC11766Clone);
            abstractC11766Clone.mParent = c21643;
        }
        return c21643;
    }
}
