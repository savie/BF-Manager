.class public final Ll/۟ᩳ᩷;
.super Ljava/lang/Object;
.source "8539"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ֡:Z

.field public ֨:[I

.field public ۖ:I

.field public ۟:Z

.field public ۡ:I

.field public ۢ:I

.field public ܰ:Z

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:[I

.field public ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 3266
    new-instance v0, Ll/֡ᩳ᩷;

    .line 3267
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3266
    sput-object v0, Ll/۟ᩳ᩷;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 3250
    iget p2, p0, Ll/۟ᩳ᩷;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3251
    iget p2, p0, Ll/۟ᩳ᩷;->ۖ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3252
    iget p2, p0, Ll/۟ᩳ᩷;->ۡ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3253
    iget p2, p0, Ll/۟ᩳ᩷;->ۡ:I

    if-lez p2, :cond_0

    .line 3254
    iget-object p2, p0, Ll/۟ᩳ᩷;->֨:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 3256
    :cond_0
    iget p2, p0, Ll/۟ᩳ᩷;->ۢ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3257
    iget p2, p0, Ll/۟ᩳ᩷;->ۢ:I

    if-lez p2, :cond_1

    .line 3258
    iget-object p2, p0, Ll/۟ᩳ᩷;->ᩳ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 3260
    :cond_1
    iget-boolean p2, p0, Ll/۟ᩳ᩷;->۟:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3261
    iget-boolean p2, p0, Ll/۟ᩳ᩷;->ܰ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3262
    iget-boolean p2, p0, Ll/۟ᩳ᩷;->֡:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3263
    iget-object p2, p0, Ll/۟ᩳ᩷;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void
.end method
