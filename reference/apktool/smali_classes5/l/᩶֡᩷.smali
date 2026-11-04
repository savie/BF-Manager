.class public final Ll/᩶֡᩷;
.super Ljava/lang/Object;
.source "K4ND"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 2554
    new-instance v0, Ll/ܿ֡᩷;

    .line 2517
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2518
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֡᩷;->ܿ:I

    .line 2519
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֡᩷;->᩶:I

    .line 2520
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Ll/ܿ֡᩷;->ܰ:Z

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2559
    new-array p1, p1, [Ll/ܿ֡᩷;

    return-object p1
.end method
