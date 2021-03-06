@file:JvmName("Coils")
@file:Suppress("unused")

package coil.api

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.annotation.DrawableRes
import coil.Coil
import coil.request.GetRequest
import coil.request.GetRequestBuilder
import coil.request.LoadRequest
import coil.request.LoadRequestBuilder
import coil.request.RequestDisposable
import coil.util.CoilContentProvider
import okhttp3.HttpUrl
import java.io.File

// This file defines a collection of type-safe load and get extension functions for Coil.
//
// Example:
// ```
// Coil.load(context, "https://www.example.com/image.jpg") {
//     networkCachePolicy(CachePolicy.DISABLED)
//     transformations(CircleCropTransformation())
//     target(imageView)
// }
// ```

// region URL (String)

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(uri).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    uri: String?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(uri).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(uri).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    uri: String,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(uri).apply(builder).build())

// endregion
// region URL (HttpUrl)

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(url).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    url: HttpUrl?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(url).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.get(GetRequest.Builder(context).data(url).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    url: HttpUrl,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(url).apply(builder).build())

// endregion
// region Uri

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(uri).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    uri: Uri?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(uri).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(uri).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    uri: Uri,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(uri).apply(builder).build())

// endregion
// region File

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(file).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    file: File?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(file).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.get(GetRequest.Builder(context).data(file).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    file: File,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(file).apply(builder).build())

// endregion
// region Resource

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(drawableRes).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    @DrawableRes drawableRes: Int,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(drawableRes).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(drawableRes).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    @DrawableRes drawableRes: Int,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(drawableRes).apply(builder).build())

// endregion
// region Drawable

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(drawable).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    drawable: Drawable?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(drawable).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(drawable).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    drawable: Drawable,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(drawable).apply(builder).build())

// endregion
// region Bitmap

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(bitmap).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.load(
    context: Context,
    bitmap: Bitmap?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(bitmap).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(bitmap).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.get(
    bitmap: Bitmap,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(bitmap).apply(builder).build())

// endregion
// region Any

@Deprecated(
    message = "Migrate to the LoadRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.execute(LoadRequest.Builder(context).data(data).apply(builder).build())",
        imports = ["coil.request.LoadRequest"]
    )
)
inline fun Coil.loadAny(
    context: Context,
    data: Any?,
    builder: LoadRequestBuilder.() -> Unit = {}
): RequestDisposable = imageLoader(context).execute(LoadRequest.Builder(context).data(data).apply(builder).build())

@Deprecated(
    message = "Migrate to the GetRequest.Builder API.",
    replaceWith = ReplaceWith(
        expression = "this.loader().get(GetRequest.Builder(context).data(data).apply(builder).build())",
        imports = ["coil.request.GetRequest"]
    )
)
suspend inline fun Coil.getAny(
    data: Any,
    builder: GetRequestBuilder.() -> Unit = {}
): Drawable = loader().get(GetRequest.Builder(CoilContentProvider.context).data(data).apply(builder).build())

// endregion
