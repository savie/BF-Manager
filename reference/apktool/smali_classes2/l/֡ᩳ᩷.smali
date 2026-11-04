.class public final Ll/֡ᩳ᩷;
.super Ljava/lang/Object;
.source "8539"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 4

    .line 3270
    new-instance v0, Ll/۟ᩳ᩷;

    .line 3192
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3193
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/۟ᩳ᩷;->᩶:I

    .line 3194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/۟ᩳ᩷;->ۖ:I

    .line 3195
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/۟ᩳ᩷;->ۡ:I

    if-lez v1, :cond_0

    .line 3197
    new-array v1, v1, [I

    iput-object v1, v0, Ll/۟ᩳ᩷;->֨:[I

    .line 3198
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 3201
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/۟ᩳ᩷;->ۢ:I

    if-lez v1, :cond_1

    .line 3203
    new-array v1, v1, [I

    iput-object v1, v0, Ll/۟ᩳ᩷;->ᩳ:[I

    .line 3204
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 3206
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Ll/۟ᩳ᩷;->۟:Z

    .line 3207
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, v0, Ll/۟ᩳ᩷;->ܰ:Z

    .line 3208
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v3, :cond_4

    const/4 v2, 0x1

    :cond_4
    iput-boolean v2, v0, Ll/۟ᩳ᩷;->֡:Z

    .line 3210
    const-class v1, Ll/᩶ᩳ᩷;

    .line 3211
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object p1

    .line 3212
    iput-object p1, v0, Ll/۟ᩳ᩷;->ܿ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 3275
    new-array p1, p1, [Ll/۟ᩳ᩷;

    return-object p1
.end method
