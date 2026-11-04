.class public final Ll/ܰᩳ᩷;
.super Ljava/lang/Object;
.source "8539"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 3161
    new-instance v0, Ll/᩶ᩳ᩷;

    .line 3111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩶ᩳ᩷;->֡:I

    .line 3113
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩶ᩳ᩷;->ܰ:I

    .line 3114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Ll/᩶ᩳ᩷;->ܿ:Z

    .line 3115
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-lez v1, :cond_1

    .line 3117
    new-array v1, v1, [I

    iput-object v1, v0, Ll/᩶ᩳ᩷;->᩶:[I

    .line 3118
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_1
    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 3166
    new-array p1, p1, [Ll/᩶ᩳ᩷;

    return-object p1
.end method
